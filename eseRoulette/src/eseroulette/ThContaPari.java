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
public class ThContaPari extends Thread{
    DatiCondivisi d;
    
    public ThContaPari(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        try {
            d.getSPari().acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThContaPari.class.getName()).log(Level.SEVERE, null, ex);
        }
        int posizione = d.getPosizioneP();
        ArrayList<Integer> array = d.getNumeriGenerati();
        Object numero = array.get(posizione);
        int n = Integer.parseInt(numero.toString());
        if(n != 0) {
            if(n % 2 == 0) {
                int pari = d.getLettiPari();
                pari = pari + 1;
                d.setLettiPari(pari);
            }
        }
        if(n == 0) {
            int zero = d.getZero();
            zero = zero + 1;
            d.setZero(zero);
        }
        posizione = posizione + 1;
        d.setPosizioneP(posizione);
    }
}
