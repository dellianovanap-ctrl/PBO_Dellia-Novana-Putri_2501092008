/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dellia260416;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamat {
    
    private String nama;
    private String address;
    private String number;
    private String email;
    
    public static int BukuAlamatCount;
    
    public BukuAlamat() {
        BukuAlamatCount++;
    }
    
     public BukuAlamat(String temp){
       this.nama = temp;
     }
        
    public BukuAlamat (String nama, String address, String number){
       this.nama = nama;
       this.address = address;
       this.number= number;
       BukuAlamatCount++;
    }
    
    public BukuAlamat (String nama, String address, String number, String email){
       this.nama = nama;
       this.address = address;
       this.number= number;
       this.email= email;
       BukuAlamatCount++;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}