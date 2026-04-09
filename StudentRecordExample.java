/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord aliRecord = new StudentRecord();
        StudentRecord aniRecord = new StudentRecord();
        StudentRecord deniRecord = new StudentRecord("Deni", "Korea");
        deniRecord.print("");
        
        aliRecord.setName("Ali");
        aliRecord.setAddress("Arab");
        aliRecord.setAge(20);
        aliRecord.setMathGrade(80);
        aliRecord.setEnglishGrade(70);
        aliRecord.setScienceGrade(90);
        
        System.out.println("Data 1");
        
        System.out.println("Nama                :" + aliRecord.getName());
        System.out.println("Alamat              :" + aliRecord.getAddress());
        System.out.println("Umur                :" + aliRecord.getAge());
        System.out.println("Matematika          :" + aliRecord.getMathGrade());
        System.out.println("B. Inggris          :" + aliRecord.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan    :" + aliRecord.getScienceGrade());
        System.out.println("Rata-rata           :" + aliRecord.getAverage());
        
        System.out.println("Data 2");
        aniRecord.setName("Ani");
        aniRecord.setAddress("Jepang");
        aniRecord.setAge(22);
        aniRecord.setMathGrade(90);
        aniRecord.setEnglishGrade(80);
        aniRecord.setScienceGrade(89);
        aniRecord.print("");
        
        System.out.println("Jumlah Siswa =" +
                StudentRecord.getStudentCount());
        
    }
}
