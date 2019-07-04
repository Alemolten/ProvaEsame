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
public class Razzo2 extends Thread{
    DatiCondivisi d;
    Random r = new Random();
    
    public Razzo2(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        d.waitSem4();
        System.out.println("Secondo razzo partito");
        int nRandom = r.nextInt(1000)+1000;
        try {
            Thread.sleep(nRandom);
        } catch (InterruptedException ex) {
            Logger.getLogger(Razzo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Seconda roccia colpita");
        d.signalSem3();
    }
}
