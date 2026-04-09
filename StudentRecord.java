/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    
    public StudentRecord(){
        studentCount++;
    }
    public StudentRecord(String temp){ 
        this.name = temp; 
        studentCount++; 
} 
    public StudentRecord(String name, String address){ 
        this.name = name; 
        this.address = address; 
        studentCount++; 
} 
    public StudentRecord(double mGrade, double eGrade, double sGrade){ 
        mathGrade = mGrade;  
        englishGrade = eGrade;  
        scienceGrade = sGrade;  
        studentCount++;  
} 
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(int mathGrade){
        this.mathGrade = mathGrade;
    }
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(int englishGrade){
        this.englishGrade = englishGrade;
    }
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade(int scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void print(String temp){
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Age:" + age);
    }
    
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Nama:" + name);
        System.out.println("Nama:" + eGrade);
        System.out.println("Nama:" + mGrade);
        System.out.println("Nama:" + sGrade);
                
    }
}
