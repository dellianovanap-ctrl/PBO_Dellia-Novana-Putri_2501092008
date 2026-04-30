/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delia260430;

/**
 *
 * @author LAB-SI-PC
 */
public class RentalMobil {
    private String IdSewa;
    private String NamaPenyewa;
    private String JenisMobil;
    private int LamaSewa;
    private double HargaSewa;
    private double BiayaSewa;
    private double BiayaTambahan;
    private double TotalBayar;
    
    public RentalMobil(String IdSewa, String NamaPenyewa, String JenisMobil, int LamaSewa){
        this.IdSewa= IdSewa;
        this.NamaPenyewa= NamaPenyewa;
        this.JenisMobil= JenisMobil;
        this.LamaSewa= LamaSewa;
        
        hitungBiaya();
     
    }
    public void hitungBiaya(){
        if(JenisMobil.equalsIgnoreCase("Avanza")){
            HargaSewa=300000;
        } else if(JenisMobil.equalsIgnoreCase("Innova")){
            HargaSewa=500000;
        } else if(JenisMobil.equalsIgnoreCase("Fortuner")){
            HargaSewa=800000;  
        } 
        BiayaSewa= HargaSewa * LamaSewa;
        if(LamaSewa > 5){
            BiayaTambahan = 0.10 * BiayaSewa;
        } else {
            BiayaTambahan = 0;
        }
        TotalBayar = BiayaSewa - BiayaTambahan;
    }
    public void tampilData(){
        System.out.println("===== DATA PENYEWA =====");
        System.out.println("ID Sewa         :" +IdSewa);
        System.out.println("Nama Penyewa    :" +NamaPenyewa);
        System.out.println("Jenis Mobil     :" +JenisMobil);
        System.out.println("Lama Sewa       :" +LamaSewa);
        System.out.println("Harga Sewa      :" +HargaSewa);
        System.out.println("Biaya Sewa      :" +BiayaSewa);
        System.out.println("Biaya Tambahan  :" +BiayaTambahan);
        System.out.println("Total Bayar     :" +TotalBayar);
                 
    }
}
