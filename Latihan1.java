/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Latihan1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int[] angka = new int[10];
            
            for (int i = 0; i < 10; i++) {
                String input = JOptionPane.showInputDialog("Masukkan angka ke-" + (i + 1) + ":");
                angka[i] = Integer.parseInt(input);
            }
            
            int terbesar = angka[0];
            for (int i = 1; i < angka.length; i++) {
                if (angka[i] > terbesar) {
                    terbesar = angka[i];
                }
            }
            
            JOptionPane.showMessageDialog(null, "Angka terbesar adalah: " + terbesar);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan input!");
        }
    }
}
 
