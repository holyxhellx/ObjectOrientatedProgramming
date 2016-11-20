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
public class TestIntegerOnly {
    //Question 6 - Create 200 threads and add 1 Integer value to the object.
    public static void main(String[] args) {
        IntegerOnly iOS = new IntegerOnly();
        final Thread[] threads = new Thread[200];
        
        for (int i = 0; i < 200; i++) {
            threads[i] = new Thread(() -> {
                iOS.i += 1;
            });
            
            threads[i].start();
            
            try {
                threads[i].join();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(iOS.i);
        
        IntegerOnlyExtended iOSExtended = new IntegerOnlyExtended();
        final Thread[] threadsExtended = new Thread[200];
        
        for (int i = 0; i < 200; i++) {
            threadsExtended[i] = new Thread(() -> {
                iOSExtended.increment();
            });
            
            threadsExtended[i].start();
            
            try {
                threadsExtended[i].join();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(iOSExtended.getInteger());
    }
    
    
    
}
