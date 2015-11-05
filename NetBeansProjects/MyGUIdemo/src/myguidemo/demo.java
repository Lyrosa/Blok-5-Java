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
public class demo {
    
    static int i = 1;
    static String a = "hello"; 
    
    
    public static void main(String[] args) 
    {            //void geeft aan dat methode geen waarde retourneerd
        System.out.println(waardeI(a));
    }
    
    public static int waardeI(int i) 
    {
        int x;
        x = i+1;
        return x;
    }
    
    public static String waardeI(String s) 
    {
        return a;
    }   
    
    
}
