/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

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
    
    //Object Variables
    private String name = "";
    private int group = 0;
    private int proficiencyInJava = 0;
    private int cprNumber = 0;
    private String gender = "";
    private int objectOrientatedProgramming;
    private int scalability;
    private int thesisPrep; 
    private int project;
    
    //Getters and Setters

    /**
     *
     * @return
     */
        public String getName() { return this.name; }

    /**
     *
     * @param Newname
     */
    public void setName(String Newname) { this.name = Newname; }
   
    /**
     *
     * @return
     */
    public int getGroup() { return this.group; }

    /**
     *
     * @param group
     */
    public void setGroup(int group) { this.group = group; }
    
    /**
     *
     * @return
     */
    public int getProficiencyInJava() { return this.proficiencyInJava; }

    /**
     *
     * @param proficiencyInJava
     */
    public void setProficiencyInJava(int proficiencyInJava) { this.proficiencyInJava = proficiencyInJava; }
    
    /**
     *
     * @param cprNumber
     * @return
     */
    public int getCprNumber(int cprNumber) { return this.cprNumber; }

    /**
     *
     * @param cprNumber
     */
    public void setCprNumber(int cprNumber) { this.cprNumber = cprNumber; }
    
    /**
     *
     * @return
     */
    public String getGender() { return this.gender; }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) { this.gender = gender; }
    
    /**
     *
     * @return
     */
    public int getObjectOrientatedProgramming() { return this.objectOrientatedProgramming; }

    /**
     *
     * @param grade
     */
    public void setObjectOrientatedProgramming(int grade) { this.objectOrientatedProgramming = grade; }
    
    /**
     *
     * @return
     */
    public int getScalability() { return this.scalability; }

    /**
     *
     * @param grade
     */
    public void setScalability(int grade) { this.scalability = grade; }
    
    /**
     *
     * @return
     */
    public int getThesisPrep() { return this.thesisPrep; }

    /**
     *
     * @param grade
     */
    public void setThesisPrep(int grade) { this.thesisPrep = grade; }
    
    /**
     *
     * @return
     */
    public int getProject() { return this.project; }

    /**
     *
     * @param grade
     */
    public void setProject(int grade) { this.project = grade; }
    
    //Compare class objects

    /**
     *
     * @param anotherStudent
     * @return
     */
        public boolean hasSameFluencyInJavaAs(Student anotherStudent){
        if(this.proficiencyInJava == anotherStudent.proficiencyInJava) return true;
        else return false;
    }
    
    //Test weather two Student Obejcts are equal
    /*
    public boolean equal(Student anotherStudent){
        if(this == anotherStudent) return true;
        else return false;
    }
    */

    /**
     *
     * @return
     */
    
    
    public static int getObjectCount() { return count; }
    
    /**
     *
     * @param proficiency
     */
    public void studentsWithProficiency(int proficiency) { if (this.proficiencyInJava == proficiency) System.out.println(this.name + " has proficiency " + proficiency); }
    
    //print class method
 
    /**
     * Print student object
     */
        public void printStudent() { 
        System.out.println("name: " + this.name + " group: " + this.group + " ProficiencyInJava: " + this.proficiencyInJava + " cprNumber: " + this.cprNumber + " Gender: " + this.gender);
    }
    
    /**
     *
     * @return
     */
    public float averageNote() {
        return ((this.objectOrientatedProgramming + this.project + this.scalability + this.thesisPrep) / 4);
    }  
        
    @Override
    public Object clone() throws CloneNotSupportedException {  
        return super.clone();  
    } 
}
