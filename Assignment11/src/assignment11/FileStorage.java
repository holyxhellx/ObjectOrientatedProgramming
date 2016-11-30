/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Asger
 * http://www.tutorialspoint.com/java/io/objectoutputstream_writeobject.htm
 * Assignment 11 - Question 3:
 */
public class FileStorage {
    public void saveToFile(Student student) {
        try {
            // I consider student cpr number to be a unique identifier
            FileOutputStream out = new FileOutputStream(student.cprNumber+".txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(out);
            objectOut.writeObject(student.name);
            objectOut.writeObject(student.group);
            objectOut.writeObject(student.proficiencyInJava);
            objectOut.writeObject(student.cprNumber);
            objectOut.writeObject(student.gender);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void loadFromFile(Student student) {
        File file = new File(student.cprNumber+".txt");
        if(file.exists()){
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(student.cprNumber+".txt"));

                System.out.println("" + (String) ois.readObject());
                System.out.println("" + ois.readObject());
                System.out.println("" + ois.readObject());
                System.out.println("" + ois.readObject());
                System.out.println("" + (String) ois.readObject());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println(student.cprNumber+".txt does not exist");
        }
    }
}
