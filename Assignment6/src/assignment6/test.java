/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author Asger
 */
public class test {
    
    public static void main(String[] args) throws Exception {
        MyStringQueue queue = new MyStringQueue(5);
        System.out.println("Queue Lenght: " + queue.length());
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        
        System.out.println("Queue Lenght: " + queue.length());
        System.out.println("Next in line: " +queue.peek());
        
        queue.dequeue();    //2,3,4,4,Null      (left in queue: 3)
        System.out.println("Queue Lenght: " + queue.length());
        System.out.println("Next in line: " +queue.peek());
        
        queue.dequeue();    //3,4,4,4,Null      (left in queue: 2)
        System.out.println("Queue Lenght: " + queue.length());
        System.out.println("Next in line: " +queue.peek());
        
        queue.dequeue();    //4,4,4,4,Null      (left in queue: 1)
        System.out.println("Queue Lenght: " + queue.length());
        System.out.println("Next in line: " +queue.peek());
        
        queue.dequeue();    //4,4,4,4,Null      (left in queue: 0)
        System.out.println("Queue Lenght: " + queue.length());
        
        queue.enqueue("5"); //4,4,4,4,Null      (left in queue: 1)
        System.out.println("Queue Lenght: " + queue.length());
        System.out.println("Next in line: " +queue.peek());
        
        //queue.print()
        //queue.lenght()
    }
}
