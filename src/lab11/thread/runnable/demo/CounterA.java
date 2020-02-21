/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11.thread.runnable.demo;

import javax.swing.JTextArea;

/**
 *
 * @author student
 */
public class CounterA implements Runnable {
    public void run() {
        increment();
    }

    //user defined function to increase counter
    public void increment() {
        int c;
        for (c = 0; c <= 1000; c++) {
            System.out.println("CounterA: increment() " + c);
            
            

            //sleep 200 milisecond
            try {
                Thread.sleep(200);
                
            } catch (InterruptedException e) {
                System.out.println("Increment Exception: " + e);
            }
           

        }//for
        
    }
    


}
