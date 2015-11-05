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
public class Studentdemo 
{   
    String haarkleur;

    public void setHaarkleur(String haarkleur) {
        this.haarkleur = haarkleur;            //this. wordt gebruikt wanneer een instance variabel de zelfde naam heeft als een parameter van een methode om aan te geven welke welke is. 
    }
    String naam;                             //leeftijd private zodat nietmand de leeftijd kan aanpassen zonder de methode set_leeftijd te gebruiken
    private int leeftijd;                   // naam en leeftijd kunnen per object anders geinitialiseerd worden
    private static int minLeeftijd = 16;         //minimum leeftijd definieren voor alle objecten die van deze class gecreerd worden => static 
                                            // final zodat variabel in dit programma ook niet meer aangepast kan worden
    public Studentdemo()
    {
        System.out.println("Init");  
    }
    
    public Studentdemo(String n)
    {
        naam = n;
    }
    
    public Studentdemo (int I)
    {
        leeftijd = I;
    }
 
    public void info ()
    {
        System.out.println("Student: "+naam);
        System.out.println("Leeftijd: "+Integer.toString(leeftijd));
    }
    
    public void setLeeftijd(int L) 
    {
        if (L<minLeeftijd)                                  // "else if" in java is de "elif" in python 
        {
            System.out.println("Dat mag niet!");
        }       
        else
        {
            leeftijd = L;        
        }
    }
    public void setminLeeftijd (int I)
    {
       minLeeftijd = I; 
    }
    
    
}
