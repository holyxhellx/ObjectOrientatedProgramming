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
public class Person { 
    String name; 
    Integer birthYear;
        
    Person(String name, int birth){ 
        this.name = name;
        this.birthYear = birth; 
    }
    
    public Integer age(){
        return birthYear;
    }
    
    public String name(){
        return name;
    }
}
