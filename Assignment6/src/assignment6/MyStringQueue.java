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
public class MyStringQueue {
    private String[] queue;
    private int C_MAX_SIZE_QUEUE;
    private int length; 
            
    public MyStringQueue(int numberOfElements) {
        C_MAX_SIZE_QUEUE = numberOfElements;
        queue = new String[numberOfElements];
        length = 0;
    }
    
    //Operation: konstant
    public void enqueue(String input) throws Exception {
        if (length < C_MAX_SIZE_QUEUE) {
            queue[length++] = input;
        }
        else throw new Exception("There is too many items in the queue");
    }
    
    //Operation: n*size
    public String dequeue() throws Exception {
        if (length > 0) {
            String output = queue[0];
            for (int i=0 ; i < (length - 1); i++){ 
                queue[i] = queue[i+1];
            }   
            length--;
            return output;
        }
        else throw new Exception("There is no more items in the queue");
    }
    
    //Operation: konstant
    public String peek() throws Exception {
        if (length > 0) return queue[0];
        else throw new Exception("There is no items in the queue");
    }
    
    public int length() {
        return length;
    }
    
    public void print() throws Exception {
        if (length > 0) for(String p : queue) System.out.println(p);
        else throw new Exception("There is no items in the queue");
    }
}
