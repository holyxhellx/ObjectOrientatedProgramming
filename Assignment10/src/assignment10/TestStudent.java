/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Asger
 */
public class TestStudent {
    public static void main(String[] args) throws FileNotFoundException {
        //Assignement 10:
        try { 
            File f = new File("_Students.txt");
            if(f.exists() && !f.isDirectory()) {
                Scanner scanner = new Scanner(f);
                while (scanner.hasNextLine()) {  
                    System.out.println("---------------- Count: "+Student.getObjectCount());
                    String line = scanner.nextLine();
                    String array[] = line.split(",");
                    Student newStudent = new Student();
                    newStudent.name = array[0].trim();
                    newStudent.group = Integer.parseInt(array[1].trim());
                    newStudent.proficiencyInJava = Integer.parseInt(array[2].trim());
                    newStudent.cprNumber = Integer.parseInt(array[3].trim());
                    newStudent.gender = array[4].trim();
                    // -------- print
                    System.out.println("Name:"+ array[0]);
                    System.out.println("group:"+ array[1]);
                    System.out.println("proficiencyInJava:"+ array[2]);
                    System.out.println("cprNumber:"+ array[3]);
                    System.out.println("gender:"+ array[4]);                
                }
                scanner.close();
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }

        //Student-creation (hardcoded)
        Student student1 = new Student("Sorin", 1, 1, 77777777, "male");
        Student student2 = new Student("Jean", 1, 2, 33333333, "female");
        student1.objectOrientatedProgramming = 7;
        student1.project = 4;
        student1.scalability = 7;
        student1.thesisPrep = 2;
        student2.objectOrientatedProgramming = 4;
        student2.project = 4;
        student2.scalability = 2;
        student2.thesisPrep = 2;
        //only student1 "Sorin" will appear in above_4.dat
        student1.saveToFile(student1);
        student2.saveToFile(student2);
        
        //Student-creation (console)
        Student s = createStudent();
        s.saveToFile(s);
        
    }
    
    public static Student createStudent() {
        Student s = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name: (txt)");
        String name = scanner.nextLine();
        System.out.println("Student group: (num)");
        int group = Integer.parseInt(scanner.nextLine());
        System.out.println("Student proficienctInJava: (num)");
        int proficienctInJava = Integer.parseInt(scanner.nextLine());
        System.out.println("Student cprNumber: (num)");
        int cprNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Student gender: (txt)");
        String gender = scanner.nextLine();
        s = new Student(name, group, proficienctInJava, cprNumber, gender);
        System.out.println("You have succesfully created a Student");
        return s;
    }
}
