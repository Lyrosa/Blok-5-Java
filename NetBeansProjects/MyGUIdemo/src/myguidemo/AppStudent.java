/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguidemo;

/**
 *
 * @author Asus
 */
public class AppStudent {
    
    public static void main(String[] args) {
        Student twee = new Student("L");                //mag niet, waarde is en blijft "null"
        Student drie = new Student(12345);
        Student vier = new Student("edwin");
        Student vijf = new Student("maarten", 12345);
     //   Student zes = new Student();
        
        
        
        twee.getStudent();
        drie.getStudent();
        vier.getStudent();
        vijf.getStudent();
        
        
    }
    
}
