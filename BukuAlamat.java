/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bukualamat;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[][] entry = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };
        
        for (int i = 0; i < entry.length; i++) {
            System.out.println("Name    : " + entry[i][0] + "\n" + 
                               "Tel. #  : " + entry[i][1] + "\n" +
                               "Address : " + entry[i][2] + "\n");
        }
    }

}   
    

