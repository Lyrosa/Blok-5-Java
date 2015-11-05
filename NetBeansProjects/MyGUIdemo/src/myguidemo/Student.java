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
public class Student 
{
    private String naam;
    private int StudNum;
    private int count = 0;
    
    public Student(String n)    //constuctor, methode met zelfde naam als class waardoor waarden bij aanmaken object meegegeven kunnen worden. 
    {                           //constructor returnt niks, maar dit hoeft niet aangegeven te worden met void. 
        System.out.println("count: "+count);
        if (count < 5)
        {            
            if (n.length() > 1)
            {
                count++;
                naam = n; 
            }
            else
            {
                System.out.println("Vul een naam in van minstens 2 letters!!");
            }
        }
        else
        {
            System.out.println("Het maximum aan te maken studenten is vier!!");
        }
    }
    
    public Student(int I)
    {
        String S;
        S = Integer.toString(I);
        if (S.length() > 4)
        {
            StudNum = I;
        }
        else
        {
            System.out.println("Een studentnummer bevat minstens 5 cijfers!!");
        }      
    }
    
    public Student(String a, int b)
    {
        String B;
        B = Integer.toString(b);
        if (B.length() > 4 || a.length() > 1)       // and = && of ||
        {
            StudNum = b;
            naam = a;
        }
        else if (B.length() < 5)
        {
            System.out.println("Een studentnummer bevat minstens 5 cijfers!!");
        }
        else if (a.length() < 2)
        {
            System.out.println("Vul een naam in van minstens 2 letters!!");
        }
        else
        {
            System.out.println("Een studentnummer bevat minstens 5 cijfers en een naam minstens 2!!");
        }       
    }
    
   // public Student()
   // {
   //     System.out.println("U moet minstens een naam of studentnummer definiëren!!");
   // }
    
    public void getStudent() 
    {
        System.out.println("Naam: "+naam);
        System.out.println("Student Nummer: "+StudNum);
    }
}
