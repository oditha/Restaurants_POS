/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassPack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danushka
 */
public class test2 {

    public static void main(String[] args) {

        try {
            SimpleDateFormat formater = new SimpleDateFormat("yyyy/MM/dd");
            
            long d1 = formater.parse("2001/1/1").getTime();
            long d2 = formater.parse("2001/1/2").getTime();
            
            System.out.println(Math.abs((d1 - d2) / (1000 * 60 * 60 * 24)));
        } catch (ParseException ex) {
            Logger.getLogger(test2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
