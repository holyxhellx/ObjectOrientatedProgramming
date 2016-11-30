/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment11;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author Asger
 */
public class TestStudent {
    public static void main(String[] args) {
        String path = "folder/";
        String file = "folder/README.md";
        
        //By default without any files or subfolders is loaded
        FileInfo fi = new FileInfo(path);
        fi.printCount();
        fi.printFiles();
        fi.printSize(file);
        fi.printType(file);
        
        //Get all files and subfolders from path
        fi.getFileAndSubFiles(path);
        fi.printCount();
        fi.printFiles();
        System.out.println(Arrays.toString(fi.findCertainFileTypes(path, args[0])));
        
        //Question 3:
        Student student0 = new Student("Sorin", 3, 1, 1012901234, "male");
        Student student1 = new Student("Chris", 2, 1, 1104911234, "female");
        FileStorage fs = new FileStorage();
        fs.saveToFile(student0);
        fs.loadFromFile(student0); 
        fs.loadFromFile(student1); //Error the file does not exists!
    }
}
