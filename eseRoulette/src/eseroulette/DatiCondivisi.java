/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eseroulette;
import java.util.*;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Alessandro
 */
public class DatiCondivisi {
    private ArrayList<Integer> numeriGenerati;
    private int elementiDaGenerare;
    private int inseritiPari;
    private int inseritiDispari;
    private int posizioneP;
    private int posizioneD;
    private int lettiPari;
    private int lettiDispari;
    private int zero;
    private Semaphore sPari;
    private Semaphore sDispari;
    private Semaphore sVisualizza;
    
    public DatiCondivisi() {
        this.numeriGenerati = new ArrayList<Integer>();
        this.elementiDaGenerare = 0;
        this.inseritiPari = 0;
        this.inseritiDispari = 0;
        this.posizioneP = 0;
        this.posizioneD = 0;
        this.lettiPari = 0;
        this.lettiDispari = 0;
        this.zero = 0;
        this.sPari = new Semaphore(0);
        this.sDispari = new Semaphore(0);
        this.sVisualizza = new Semaphore(0);
    }
    
    public ArrayList getNumeriGenerati() {
        return this.numeriGenerati;
    }
    
    public void setNumeriGenerati(ArrayList numeriGenrati) {
        this.numeriGenerati = numeriGenerati;
    }
    
    public int getElementiDaGenerare() {
        return this.elementiDaGenerare;
    }
    
    public void setElementiDaGenerare(int elementiDaGenerare) {
        this.elementiDaGenerare = elementiDaGenerare;
    }
    
    public int getInseritiPari() {
        return this.inseritiPari;
    }
    
    public void setInseritiPari(int inseritiPari) {
        this.inseritiPari = inseritiPari;
    }
    
    public int getInseritiDispari() {
        return this.inseritiDispari;
    }
    
    public void setInseritiDispari(int inseritiDispari) {
        this.inseritiDispari = inseritiDispari;
    }
    
    public int getPosizioneP() {
        return this.posizioneP;
    }
    
    public void setPosizioneP(int posizioneP) {
        this.posizioneP = posizioneP;
    }
    
    public int getPosizioneD() {
        return this.posizioneD;
    }
    
    public void setPosizioneD(int posizioneD) {
        this.posizioneD = posizioneD;
    }
    
    public int getLettiPari() {
        return this.lettiPari;
    }
    
    public void setLettiPari(int lettiPari) {
        this.lettiPari = lettiPari;
    }
    
    public int getLettiDispari() {
        return this.lettiDispari;
    }
    
    public void setLettiDispari(int lettiDispari) {
        this.lettiDispari = lettiDispari;
    }
    
    public int getZero() {
        return this.zero;
    }
    
    public void setZero(int zero) {
        this.zero = zero;
    }
    
    public Semaphore getSPari() {
        return this.sPari;
    }
    
    public void setSPari(Semaphore sPari) {
        this.sPari = sPari;
    }
    
    public Semaphore getSDispari() {
        return this.sDispari;
    }
    
    public void setSDispari(Semaphore sDispari) {
        this.sDispari = sDispari;
    }
    
    public Semaphore getSVisualizza() {
        return this.sVisualizza;
    }
    
    public void setSVisualizza(Semaphore sVisualizza) {
        this.sVisualizza = sVisualizza;
    }
}
