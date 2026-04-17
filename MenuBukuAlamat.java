/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dellia260416;
import java.util.Scanner;
/**
 *
 * @author LAB-SI-PC
 */
public class MenuBukuAlamat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BukuAlamatData data = new BukuAlamatData();

        int pilihan;
        
        do {
            System.out.println("\n=== MENU BUKU ALAMAT ===");
            System.out.println();
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();


            switch (pilihan) {

                case 1:
                    System.out.print("Index: ");
                    int i = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama: ");
                    String nama = input.nextLine();

                    System.out.print("Alamat: ");
                    String alamat = input.nextLine();

                    System.out.print("Telepon: ");
                    int number = input.nextInt();
                    input.nextLine();

                    System.out.print("Email: ");
                    String email = input.nextLine();

                    BukuAlamat baru = new BukuAlamat(nama, alamat, number, email);
                    data.insert(baru, i);
                    break;

                case 2:
                    data.View();
                    break;

                case 3:
                    System.out.print("Index yang mau diupdate: ");
                    int u = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama baru: ");
                    String namaBaru = input.nextLine();

                    System.out.print("Alamat baru: ");
                    String alamatBaru = input.nextLine();

                    System.out.print("Telepon baru: ");
                    int telpBaru = input.nextInt();
                    input.nextLine();

                    System.out.print("Email baru: ");
                    String emailBaru = input.nextLine();

                    BukuAlamat update = new BukuAlamat(namaBaru, alamatBaru, numberBaru, emailBaru);
                    data.update(update, u);
                    break;

                case 4:
                    System.out.print("Index yang mau dihapus: ");
                    int d = input.nextInt();
                    data.delete(d);
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak ada!");
            }

        } while (pilihan != 5);
    }
}
