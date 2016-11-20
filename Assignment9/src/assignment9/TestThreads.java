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
public class TestThreads {
    //Question 2, 3 & 4 Implementation of threads
    public static void main(String[] args) {
        //Question 2-3
        (new Thread(new CharacterRunnable('a'))).start();
        (new Thread(new IntegerRunnable(3))).start();
    
        //Question 4 - join threads
        CharacterRunnable Assign1 = new CharacterRunnable('b');
        IntegerRunnable Assign2 = new IntegerRunnable(2);
        
        Thread thread1 = new Thread(Assign1);
        Thread thread2 = new Thread(Assign2);
        
        try {
            thread1.join();
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        
        thread1.start();
        thread2.start();
    }
}