/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserazzo;
import java.util.*;
import java.util.concurrent.Semaphore;

/**
 *
 * @author CorsiMariano
 */
public class DatiCondivisi {
    private Semaphore arrivoR1;
    private Semaphore arrivoR2;
    
    public DatiCondivisi() {
        this.arrivoR1 = new Semaphore(0);
        this.arrivoR2 = new Semaphore(0);
    }
    
    public void setArrivoR1(Semaphore arrivoR1) {
        this.arrivoR1 = arrivoR1;
    }
    
    public void setArrivoR2(Semaphore arrivoR2) {
        this.arrivoR2 = arrivoR2;
    }
    
    public Semaphore getArrivoR1() {
        return this.arrivoR1;
    }
    
    public Semaphore getArrivoR2() {
        return this.arrivoR2;
    }
}