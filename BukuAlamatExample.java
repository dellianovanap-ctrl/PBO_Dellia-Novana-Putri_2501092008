/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dellia260416;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatExample {
    public static void BukuAlamatExample(){
        BukuAlamatData data = new BukuAlamatData();
        BukuAlamat bukuAlamat = new BukuAlamat();
        bukuAlamat.setNama("Ali");
        bukuAlamat.setAddress("Korea");
        bukuAlamat.setNumber("46789399784");
        bukuAlamat.setEmail("ali@coba.com");
        data.insert(bukuAlamat, 0);
        bukuAlamat = new BukuAlamat();
        bukuAlamat.setNama("Budi");
        bukuAlamat.setAddress("Jakarta");
        bukuAlamat.setNumber("089996585304");
        bukuAlamat.setEmail("budi@coba.com");
        data.insert(bukuAlamat, 1);
        data.View();
    }
}
