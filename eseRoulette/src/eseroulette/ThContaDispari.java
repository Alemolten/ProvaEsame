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
public class ThContaDispari extends Thread{
    DatiCondivisi d;
    
    public ThContaDispari(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        try {
            d.getSDispari().acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThContaDispari.class.getName()).log(Level.SEVERE, null, ex);
        }
        int posizione = d.getPosizioneD();
        ArrayList<Integer> array = d.getNumeriGenerati();
        Object numero = array.get(posizione);
        int n = Integer.parseInt(numero.toString());
        if(n % 2 == 0) {
            
        }
        else {
            int dispari = d.getLettiDispari();
            dispari = dispari + 1;
            d.setLettiDispari(dispari);
        }
    }
}
