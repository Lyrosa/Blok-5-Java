package Week7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class HydroTrans 
{
    public int[] Check (String[] s)
    {
        
        int len = s.length;
        int[] lijst = new int[len];
        Pattern fiel = Pattern.compile("^[RKNHP]*$");
        Pattern foob = Pattern.compile("^[LIFWVMCYA]*$");     
        Pattern neu = Pattern.compile("^[TEGSQD]*$");
        
        for (int i = 0;i<len;i++ )
        {
            Matcher m1 = fiel.matcher(s[i]);
            boolean b1 = m1.matches();
            Matcher m2 = foob.matcher(s[i]);
            boolean b2 = m2.matches();
            Matcher m3 = neu.matcher(s[i]);
            boolean b3 = m3.matches();
            
            if (b1 == true)
            {
                lijst[i] = 1;
            }
            else if (b2 == true)
            {
                lijst[i] = 2;
            }
            else if (b3 == true)
            {
                lijst[i] = 3;
            }
            else
            {
                System.out.println("Niet bestaand aminozuur");
            }
        }
        
        return lijst;
    }
}
