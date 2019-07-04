/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserazzo;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CorsiMariano
 */
public class Roccia2 extends Thread{
    DatiCondivisi d;
    Random r = new Random();
    
    public Roccia2(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        d.waitSem3();
        System.out.println("Inzio distruzione seconda roccia");
        int nRandom = r.nextInt(1000)+1000;
        try {
            Thread.sleep(nRandom);
        } catch (InterruptedException ex) {
            Logger.getLogger(Roccia2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Fine distruzione seconda roccia");
        d.signalSem4();
    }
}