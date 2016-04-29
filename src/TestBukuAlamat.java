package Bab4;

/**
 *
 * @author abdu_
 */
import java.util.Scanner;

public class TestBukuAlamat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BukuAlamat[] data = new BukuAlamat[10];
        int i = 0;
        String choice;
        do {
            System.out.print("+===============================================+\n"
                    + "|\t     BUKU ALAMAT ELEKTRONIK\t\t|\n"
                    + "+===============================================+\n"
                    + "| (1) Tambah Data Baru\t\t"
                    + " (3) Edit Data\t|\n"
                    + "| (2) Tampilkan Data\t\t"
                    + " (0) Exit\t|\n"
                    + "+-----------------------------------------------+\n"
                    + "\t      Masukkan Pilihan : ");
            choice = input.next();
            switch (choice) {
                case "1":
                    System.out.println("+-----------------------------------------------+");
                    System.out.print("  Masukkan Nama\t\t: ");
                    String a = inputLine();
                    System.out.print("  Masukkan Alamat\t: ");
                    String b = inputLine();
                    System.out.print("  Masukkan Nomor Telepon: ");
                    String c = inputLine();
                    System.out.print("  Masukkan Alamat Email\t: ");
                    String d = inputLine();
                    System.out.println("+-----------------------------------------------+");
                    data[i] = new BukuAlamat(a, b, c, d);
                    i++;
                    System.err.print(" << input anykey to back ");
                    inputLine();
                    break;
                case "2":
                    if (i != 0) {
                        System.out.println("+-----------------------------------------------+");
                        System.out.println("| Attribut\t| Deskripsi\t\t\t|");
                        System.out.println("|-----------------------------------------------|");
                        for (int u = 0; u < i; u++) {
                            System.out.printf("| Nama\t\t| %-27s%2s |\n", data[u].getName(), (u + 1));
                            System.out.printf("| Alamat\t| %-30s|\n", data[u].getAddress());
                            System.out.printf("| Nomor Telepon\t| %-30s|\n", data[u].getPhoneNumber());
                            System.out.printf("| Alamat Email\t| %-30s|\n", data[u].getEmail());
                            System.out.println("+-----------------------------------------------+");
                        }
                    } else {
                        System.out.println("\t     MAAF DATA MASIH KOSONG");
                    }
                    System.err.print(" << input anykey to back ");
                    inputLine();
                    break;
                case "3":
                    if (i != 0) {
                        System.out.println("+-----------------------------------------------+");
                        System.out.print("  Masukkan No Urut data yang akan diedit: ");
                        int x = input.nextInt();
                        if (x > 0 && x <= i) {
                            System.out.println("+-----------------------------------------------+");
                            System.out.print("  Edit Nama\t\t: ");
                            data[x - 1].setName(inputLine());
                            System.out.print("  Edit Alamat\t\t: ");
                            data[x - 1].setAddress(inputLine());
                            System.out.print("  Edit Nomor Telepon\t: ");
                            data[x - 1].setPhoneNumber(inputLine());
                            System.out.print("  Edit Alamat Email\t: ");
                            data[x - 1].setEmail(inputLine());
                            System.out.println("+-----------------------------------------------+");
                        } else {
                            System.out.println("\t   MAAF DATA TIDAK DITEMUKAN!");
                        }
                    } else {
                        System.out.println("\t     MAAF DATA MASIH KOSONG");
                    }
                    System.err.print(" << input anykey to back ");
                    inputLine();
                    break;
                case "0":
                    System.err.println("   TERIMAKASIH ANDA SUDAH KELUAR DARI PROGRAM!");
                    break;
                default:
                    System.out.println("\t  MAAF PILIHAN TIDAK TERSEDIA!\n");
            }
        } while (!"0".equals(choice));
    }

    public static String inputLine() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
