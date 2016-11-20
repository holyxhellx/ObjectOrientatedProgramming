/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

/**
 *
 * @author Asger
 */
public class CharacterRunnable implements Runnable {

    private char a;
    
    public CharacterRunnable(char a) {
        super();
        this.a = a;
    }
    
    @Override
    public void run() {
        System.out.println("Thread no. "+ Thread.currentThread() +": init");
        //Question 4 (sleep for another thread to run)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.print("Error: Thread.sleep() "+ex);
        }
        
        for (int n = 0; n < 100; n++) {
            System.out.println(a);
            //Question 3 (implement yield())
            Thread.yield();
        }
        
        System.out.println("Thread no. "+ Thread.currentThread() +": end");
    }
}
