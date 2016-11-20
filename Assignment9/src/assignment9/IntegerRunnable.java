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
public class IntegerRunnable implements Runnable {
    
    private int no;
    
    public IntegerRunnable(int no) {
        super();
        this.no = no;
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
        
        for (int m = 0; m < 100; m++) {
            System.out.println(no);
            //Question 3 (implement yield())
            Thread.yield();
        }
        
        System.out.println("Thread no. "+ Thread.currentThread() +": end");   
    }
}
