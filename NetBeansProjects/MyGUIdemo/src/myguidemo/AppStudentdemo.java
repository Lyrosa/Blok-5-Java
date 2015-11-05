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
public class AppStudentdemo 
{

    public static void main(String[] args) 
    {
        Studentdemo twee = new Studentdemo("Lysanne");
        twee.setLeeftijd(19);
        twee.info();

        //Student.minLeeftijd = 10;  class student kan alleen benaderd worden voor het veranderen van static variabelen, niet bij instance variabelen, die moeten per object gedefinieerd worden. 
        //wanneer in studentdemo.java de minLeeftijd niet private en final is ten minste. 
        Studentdemo drie = new Studentdemo(16);
        drie.naam = "Lieke";
        drie.info();

        Studentdemo vier = new Studentdemo("Jordan");
        vier.info();

        Studentdemo vijf = new Studentdemo(16);
        vijf.info();

    }

}
