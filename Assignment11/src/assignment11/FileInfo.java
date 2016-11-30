/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment11;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Asger
 * http://stackoverflow.com/questions/12616124/get-number-of-files-in-a-directory-and-its-subdirectories
 */
public class FileInfo {
    int count = 0;
    File[] files;

    FileInfo(String path) { this.getFile(path); }

    public void getFile(String path) {
        File f = new File(path);
        files = f.listFiles();

        if (files != null) {
                for (int i = 0; i < files.length; i++) {
                count++;
                File file = files[i];
            }
        }
    }
    
    public File[] getFiles() {
        return files;
    }
    
    public void printFiles() {
        System.out.println("Name of files in directory: ");
        for (int i = 0; i < files.length; i ++) System.out.println(files[i]);
    }
    
    public void printCount() { System.out.println("Number of elements: " +count); }
    
    public void printSize(String path) {
        File file =new File(path);
        if(file.exists()){
            double bytes = file.length();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            //double gigabytes = (megabytes / 1024);
            //double terabytes = (gigabytes / 1024);
            
            if (bytes < 1024) System.out.println("Size of file in bytes: " + bytes);
            else if (bytes >= 1024) System.out.println("Size of file in kilobytes: " + kilobytes);
            else if (bytes >= 2048) System.out.println("megabytes: " + megabytes);
            //System.out.println("gigabytes: " + gigabytes);
            //System.out.println("terabytes: " + terabytes);
        } else System.out.println("File does not exists!");
    }
    
    public void printType(String path) {
        File file = new File(path);
        if(file.exists()) System.out.println("Type of file: " +path.substring(path.lastIndexOf(".")));
        else System.out.println("File does not exists!");
    }
    
    public void getFileAndSubFiles(String path) {
        File f = new File(path);
        files = f.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                count++;
                File file = files[i];
                if (file.isDirectory()) getFile(file.getAbsolutePath()); 
            }
        }
    }
    
    //http://stackoverflow.com/questions/1384947/java-find-txt-files-in-specified-folder
    public File[] findCertainFileTypes(String dirName, String args){
        File f = new File(dirName);
        return f.listFiles(new FilenameFilter() { 
            public boolean accept(File f, String filename) { 
                return filename.endsWith(args); 
            }
        });
    }
}
