/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eseroulette;
import java.util.*;

/**
 *
 * @author Alessandro
 */
public class ThGenera extends Thread{
    DatiCondivisi d;
    
    public ThGenera(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        Random r = new Random();
        
        ArrayList<Integer> array = d.getNumeriGenerati();
        int n = r.nextInt();
        array.add(n);
        d.setNumeriGenerati(array);
        if(n != 0) {
            if(n % 2 == 0) {
                int pari = d.getInseritiPari();
                pari = pari + 1;
                d.setInseritiPari(pari);
            }
            else {
                int dispari = d.getInseritiDispari();
                dispari = dispari + 1;
                d.setInseritiDispari(dispari);
            }
        }
        d.getSPari().release();
        d.getSDispari().release();
        d.getSVisualizza().release();
    }
}
