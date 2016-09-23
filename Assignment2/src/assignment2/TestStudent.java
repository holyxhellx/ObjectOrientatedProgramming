/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import static assignment2.Student.getObjectCount;
import edu.princeton.cs.algs4.*;

/**
 *
 * @author Asger
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        //Question 3: Student constructor
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        
        //Question 3 & 8: Set values for students
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
                
        //Question 4: Compare proficiency of students
        System.out.println("Does student1 and student2 have the same java skills: " + student1.hasSameFluencyInJavaAs(student2)); //return false
        System.out.println("Does student1 and student3 have the same java skills: " + student1.hasSameFluencyInJavaAs(student3)); //return true
        
        //Question 5: Test weather two Objects are equal
        /* The results of using the "default" and "student" equals() method is 
        the same. They both compares the objects value/properties */
        System.out.println("Is student1 and student1 the same object: " + student1.equals(student1)); //return true
        System.out.println("Is student1 and student2 the same object: " + student1.equals(student2)); //return false
        
        //get the number of objects created in Student class
        //System.out.println(Student.getObjectCount());
        
        //Question 6: Print the student who has lvl of 2 in proficiency
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
        
        //Question 9: Clone a Student and print/compare the objects
        Student student6 = (Student) student1.clone();
        student1.printStudent();
        student6.printStudent();
        
        /*Quetstion 10:
         * this.name = name into name = this.name   : Here the "name" is altered to the stored value of this.name (object value).
         * name = this.name into name = name        : Here the "name" is "name" nothing is stored/altered in the obejct.
         */
        
        /*Question 11:
         * Java and the language is constructed in such a way that it always 
         * needs a public static void main(..) method to execute.
         */
        
        /* Question 13:
         * Created a JavaDoc document. (Tool --> Analyze Javadoc.) 
         * - Perhaps some comments for each method in the class document would have been ideal...
         */
        
        /* Question 15:
         * Read from the command line input: "TA1 TA3 ST3 TA4 PHD6"
         */
        int count = args.length;
        for (int i = 0 ; i < count ; i++ ) {
            String line = args[i];
            if (line.contains("ST")) { 
                Student student = new Student();
                student.setName("New ST student" +Integer.toString(i));
                student.setGroup(0); //not jet in a group (1 or 2)
                student.setProficiencyInJava(0);
                student.setCprNumber(1234000007 + i);
                student.setGender("nn");
                student.printStudent();
            }
            else if (line.contains("TA")) {
                TAStudent taStudent = new TAStudent();
                taStudent.setName("New TA Student" +Integer.toString(i));
                taStudent.setGroup(3); //group 3 i reserve for TA´s
                taStudent.setProficiencyInJava(5);
                taStudent.setCprNumber(1234000007 + i);
                taStudent.setGender("nn");
                taStudent.printTAStudent();
            }
            else {
                PhDStudent phDStudent = new PhDStudent();
                phDStudent.setName("New Ph Student" +Integer.toString(i));
                phDStudent.setGroup(4); //group 4 i reserve for PhD
                phDStudent.setProficiencyInJava(500);
                phDStudent.setCprNumber(1234000007 + i);
                phDStudent.setGender("nn");
                phDStudent.printPhDStudent();
            }
        } 
    }
}
