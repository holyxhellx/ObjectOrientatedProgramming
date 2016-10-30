/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Asger
 */
public class PhDStudent extends Student {
    //Class variables
    private static int count = 0; //static fields are share by all instances of a class
    private String subject;
    
    //Constructor
    public PhDStudent(){
        count++;
    }
    
    public PhDStudent(String name, String subject, int group) {
        this.name = name;
        this.subject = subject;
        this.group = group;
        count++;
    }
    
    //Getter & Setter
    public static int getCountPhDStudents() { return count; } 
    
    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }
    
    //Methods
    public boolean equals(PhDStudent anotherStudent) {
        return this.name.equals(anotherStudent.getName())
                && this.subject.equals(anotherStudent.getSubject());
    }
    
    @Override
    public Student clone() {
        return new PhDStudent(this.name, this.subject, this.group);
    }
    
    @Override
    public String toString() {
        return "PhD Student " + this.name + " is doing research in " + this.subject;
    }
}

