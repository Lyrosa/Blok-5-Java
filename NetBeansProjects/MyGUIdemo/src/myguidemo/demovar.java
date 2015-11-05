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
public class demovar {
    public static void main(String[] args) {
        int i;
        //byte i;       byte 0-256
        //i = 999;      bij i is byte en 999 wordt aangegeven dat er geen 999 in een byte past. Wel -19. 
        i = 19;
        
        float f;
        f = 999.345f;    //zonder de f achter het getal neemt java het getal als een double   
        f = (float) 999.345;     //getal aangepast voor de maat float (casting naar float)
                
        double x;       //double is de default voor een gebroken getal
        x = 999.345;
        f = (float)x;  //casten van een variabel moet gedaan worden met (float), anders vraag je om een onbekend variabel xf
        
        //public final double PI;
        //PI = 3.14;
                
        System.out.println(i);
        System.out.println(f);
        
        
        
        
        
    }
   
}
