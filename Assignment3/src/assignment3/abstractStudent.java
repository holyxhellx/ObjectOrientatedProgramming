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
public abstract class abstractStudent {

    //Class variables
    private static int count = 0; //static fields are share by all instances of a class

    /**
     *  Run this for every instance created
     */
    public abstractStudent(){
        count++;
    }
    
    //Object Variables
    private String name = "";
    private int group = 0;
    protected int proficiencyInJava = 0;
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

    
    /*
    *   This test the abstract class student by creating a student 
    *
    */
    public static void main(String[] args) {
        //Student constructor
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        
        //Set values for students
        student1.setName("John Doe");
        student2.setName("Foo Kung");
        student3.setName("Bah Bail");
        student4.setName("Half dok");
        student5.setName("Sibre Di");
        student1.setGroup(1);
        student2.setGroup(1);
        student3.setGroup(2);
        student4.setGroup(2);
        student5.setGroup(1);
        student1.setProficiencyInJava(2);
        student2.setProficiencyInJava(1);
        student3.setProficiencyInJava(2);
        student4.setProficiencyInJava(2);
        student5.setProficiencyInJava(1);
        student1.setCprNumber(1234000001);
        student2.setCprNumber(1234000002);
        student3.setCprNumber(1234000003);
        student4.setCprNumber(1234000004);
        student5.setCprNumber(1234000005);
        student1.setGender("Male");
        student2.setGender("Female");
        student3.setGender("Male");
        student4.setGender("Female");
        student5.setGender("Male");
        student1.setObjectOrientatedProgramming(10);
        student2.setObjectOrientatedProgramming(4);
        student3.setObjectOrientatedProgramming(7);
        student4.setObjectOrientatedProgramming(12);
        student5.setObjectOrientatedProgramming(4);
        student1.setProject(4);
        student2.setProject(10);
        student3.setProject(2);
        student4.setProject(12);
        student5.setProject(4);
        student1.setScalability(4);
        student2.setScalability(2);
        student3.setScalability(10);
        student4.setScalability(12);
        student5.setScalability(4);
        student1.setThesisPrep(4);
        student2.setThesisPrep(0);
        student3.setThesisPrep(-3);
        student4.setThesisPrep(4);
        student5.setThesisPrep(2);
        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
        student4.printStudent();
        student5.printStudent();
                
        //Compare proficiency of students
        System.out.println("Does student1 and student2 have the same java skills: " + student1.hasSameFluencyInJavaAs(student2)); //return false
        System.out.println("Does student1 and student3 have the same java skills: " + student1.hasSameFluencyInJavaAs(student3)); //return true
        
        //Test weather two Objects are equal
        /* The results of using the "default" and "student" equals() method is 
        the same. They both compares the objects value/properties */
        System.out.println("Is student1 and student1 the same object: " + student1.equals(student1)); //return true
        System.out.println("Is student1 and student2 the same object: " + student1.equals(student2)); //return false
        
        //get the number of objects created in Student class
        System.out.println("Number of students created in total: " + Student.getObjectCount()); //print 5 (true)
        
        //Print the student who has lvl of 2 in proficiency
        student1.studentsWithProficiency(2);    //print true
        student2.studentsWithProficiency(2);    //print false
        student3.studentsWithProficiency(2);    //print true
        student4.studentsWithProficiency(2);    //print true
        student5.studentsWithProficiency(2);    //print false
        
        //Question 8: Print the average grade for every student
        System.out.println("Average Grade student1: " + student1.averageNote());
        System.out.println("Average Grade student2: " + student2.averageNote());
        System.out.println("Average Grade student3: " + student3.averageNote());
        System.out.println("Average Grade student4: " + student4.averageNote()); // ((12 + 12 + 12 + 4) / 4) = 10  
        System.out.println("Average Grade student5: " + student5.averageNote()); // ((4 + 4 + 4 + 2) / 4) = 3.5 (float = floor number by default)
    }
}
