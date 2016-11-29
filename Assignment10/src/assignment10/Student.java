/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment10;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Asger
 */
public class Student implements Cloneable {
    //Class variables
    private static int count = 0; //static fields are share by all instances of a class
    private MyLog log = new MyLog();
    /**
     *  Run this for every instance created
     */
    public Student(){
        count++;
        log.logger("student created default");
    }
    
    public Student(String name, int group, int proficienctInJava, int cprNumber, String gender){
        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.cprNumber = cprNumber;
        this.gender = gender;
        count++;
        log.logger("student created: " +name);  
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
    
    /*
    ** Assignment 10:
    ** http://stackoverflow.com/questions/1053467/how-do-i-save-a-string-to-a-text-file-using-java
    */
    public void loadFromFile() {
        try { 
            File f = new File("_Students.txt");
            if(f.exists() && !f.isDirectory()) {
                Scanner scanner = new Scanner(f);
                while (scanner.hasNextLine()) {  
                    System.out.println("---------------- Count: "+Student.count);
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
                log.logger("File _Student.txt has been loaded");
            }
        } catch (FileNotFoundException e) {
           log.loggerWarning(e.toString());
        }
    }
    
    public void saveToFile(Student student) {
        try {
            String studentInfo = student.name + "," + student.group + "," + student.proficiencyInJava + "," + student.cprNumber + "," + student.gender +"\n";
            BufferedWriter writeAllObjectes = new BufferedWriter(new FileWriter("_Students.txt", true));
            writeAllObjectes.write(studentInfo);
            writeAllObjectes.close();
            if (student.averageNote() > 4) {
                BufferedWriter writeAboveAvg = new BufferedWriter(new FileWriter("above_4.txt", true));
                writeAboveAvg.write(studentInfo);
                writeAboveAvg.close();
            }
            log.loggerConsole("File and Student has been succesfully saved to program");
        } catch (IOException e) {
           log.loggerWarning(e.toString());
        }
    }
}