/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author LAB-SI-PC
 */
public class HaridalamMinggu {
    public static void main(String[] args) {
        
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        System.out.println("While Loop:");
        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }
        
        System.out.println();
        
        System.out.println("Do While:");
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);
        
        System.out.println();
        
        System.out.println("For Loop:");
        for (int k = 0; k < days.length; k++) {
            System.out.println(days[k]);
        }
    }
}

