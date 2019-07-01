/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eseroulette;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alessandro
 */
public class ThVisualizza extends Thread{
    DatiCondivisi d;
    
    public ThVisualizza(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        try {
            d.getSVisualizza().acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThVisualizza.class.getName()).log(Level.SEVERE, null, ex);
        }
        int iPari = d.getInseritiPari();
        System.out.println("I pari inseriti sono: " + iPari);
        int iDispari = d.getInseritiDispari();
        System.out.println("I dispari inseriti sono: " + iDispari);
        int lPari = d.getLettiPari();
        System.out.println("I pari letti sono: " + lPari);
        int lDispari = d.getLettiDispari();
        System.out.println("I dispari letti sono: " + lDispari);
    }
}
