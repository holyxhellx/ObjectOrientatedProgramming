/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Asger
 */
public class Student extends abstractStudent {
    
    //Class variables
    private static int count = 0; //static fields are share by all instances of a class
    
    public Student(){
        count++;
    }
    
    //Get number of Students created
    public static int getCountStudents() { return count; } 
}
