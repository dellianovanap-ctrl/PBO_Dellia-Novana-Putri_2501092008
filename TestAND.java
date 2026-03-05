/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class TestAND {
    public static void main ( String[] args){
            int i = 0;
            int j = 10;
            boolean test = false;
            
            //demostrasi
            test = (i > 10) && (j++ > 9); //jika benar maka yg kedua tidak dikerjakan
            System.out.println(i);
            System.out.println(j);
            System.out.println(test);
            
            //demostrasi &
            test = (i > 10) & (j++ > 9); //& sama dengan operator //dikerjakan keduanya
            System.out.println(i);
            System.out.println(j);
            System.out.println(test);
    }
}
