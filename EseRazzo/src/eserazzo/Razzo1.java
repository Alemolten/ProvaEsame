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
public class Razzo1 extends Thread{
    DatiCondivisi d;
    Random r = new Random();
    
    public Razzo1(DatiCondivisi d) {
        this.d = d;
    }
    
    @Override
    public void run() {
        d.waitSem2();
        System.out.println("Primo razzo partito");
        int nRandom = r.nextInt(1000)+1000;
        try {
            Thread.sleep(nRandom);
        } catch (InterruptedException ex) {
            Logger.getLogger(Razzo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Prima roccia colpita");
        d.signalSem1();
    }
}