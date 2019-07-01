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
public class EseRoulette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi d = new DatiCondivisi();
        ThGenera thG = new ThGenera(d);
        ThContaPari thCP = new ThContaPari(d);
        ThContaDispari thCD = new ThContaDispari(d);
        ThVisualizza thV = new ThVisualizza(d);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di elementi da generare");
        int nGenerare = input.nextInt();
        d.setElementiDaGenerare(nGenerare);
        for(int i = 0; i < nGenerare; i++) {
            thG.start();
            thCP.start();
            thCD.start();
            thV.start();
        }
        try {
            thG.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EseRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            thCP.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EseRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            thCD.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EseRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            thV.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EseRoulette.class.getName()).log(Level.SEVERE, null, ex);
        }
        int zero = d.getZero();
        System.out.println("Numero di zeri letti" + zero);
    }

}
