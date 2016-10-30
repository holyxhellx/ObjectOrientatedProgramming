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
public class Student implements Cloneable {
    //Class variables
    private static int count = 0; //static fields are share by all instances of a class

    /**
     *  Run this for every instance created
     */
    public Student(){
        count++;
    }
    
    public Student(String name, int group, int proficienctInJava, int cprNumber, String gender){
        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.cprNumber = cprNumber;
        this.gender = gender;
        count++;
    }
    
    //Object Variables
    protected String name = "";
    protected int group = 0;
    protected int proficiencyInJava = 0;
    protected int cprNumber = 0;
    protected String gender = "";
    protected int objectOrientatedProgramming;
    protected int scalability;
    protected int thesisPrep; 
    protected int project;
    
    //Getters and Setters
    public String getName() { return this.name; }

    public void setName(String Newname) { this.name = Newname; }
   
    public int getGroup() { return this.group; }

    public void setGroup(int group) { this.group = group; }
    
    public int getProficiencyInJava() { return this.proficiencyInJava; }

    public void setProficiencyInJava(int proficiencyInJava) { this.proficiencyInJava = proficiencyInJava; }
    
    public int getCprNumber(int cprNumber) { return this.cprNumber; }

    public void setCprNumber(int cprNumber) { this.cprNumber = cprNumber; }
    
    public String getGender() { return this.gender; }

    public void setGender(String gender) { this.gender = gender; }
    
    public int getObjectOrientatedProgramming() { return this.objectOrientatedProgramming; }

    public void setObjectOrientatedProgramming(int grade) { this.objectOrientatedProgramming = grade; }
    
    public int getScalability() { return this.scalability; }

    public void setScalability(int grade) { this.scalability = grade; }
    
    public int getThesisPrep() { return this.thesisPrep; }

    public void setThesisPrep(int grade) { this.thesisPrep = grade; }
    
    public int getProject() { return this.project; }

    public void setProject(int grade) { this.project = grade; }
    
    public boolean hasSameFluencyInJavaAs(Student anotherStudent){
        if(this.proficiencyInJava == anotherStudent.proficiencyInJava) return true;
        else return false;
    } 
    
    @Override
    public String toString() {
        return "name: " + this.name + " group: " + this.group + " " +
               "ProficiencyInJava: " + this.proficiencyInJava + 
               " cprNumber: " + this.cprNumber + " Gender: " + this.gender;
    }
    
    public static int getObjectCount() { return count; }
    
    public boolean equals(Student anotherStudent) { return this.name.equals(anotherStudent.getName()); }

    public void studentsWithProficiency(int proficiency) { if (this.proficiencyInJava == proficiency) System.out.println(this.name + " has proficiency " + proficiency); }
    
    public void printStudent() { 
        System.out.println("name: " + this.name + " group: " + this.group + " ProficiencyInJava: " + this.proficiencyInJava + " cprNumber: " + this.cprNumber + " Gender: " + this.gender);
    }
    
    public float averageNote() {
        return ((this.objectOrientatedProgramming + this.project + this.scalability + this.thesisPrep) / 4);
    }  
    
    @Override
    public Student clone() {
        return new Student(this.name, this.group, this.proficiencyInJava, this.cprNumber, this.gender);
    }
}
