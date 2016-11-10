/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

/**
 *
 * @author Asger
 */
public class Student extends Person { 
    String university;
    
    Student(String name, int birth){ 
        super(name, birth);
        university = "ITU"; 
    }
    
    Student(String name, int birth, String university){ 
        super(name, birth);
        this.university = university; 
    }
}
