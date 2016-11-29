/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment10;
import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

/**
 *
 * @author Asger
 * http://stackoverflow.com/questions/15758685/how-to-write-logs-in-text-file-when-using-java-util-logging-logger
 */
public class MyLog {
    private static final Logger logger = Logger.getLogger("MyLog"); 
   
    /*
    ** This log - method log to both console and file with type: info
    ** The method is used when the program does a new major event during run-time
    */
    public void logger(String log) {   
        FileHandler fh;
        try {
            fh = new FileHandler("MyLog.log",true); 
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
            
            logger.info(log);
            fh.close();
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /*
    ** This log - method log to both console and file with type: warning
    ** The method is only used to catch error from try-catch statements
    */
    public void loggerWarning(String log) {
        FileHandler fh;
        try {
            fh = new FileHandler("MyLog.log",true); 
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
            
            logger.warning(log);
            fh.close();
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /*
    ** This log - method only writes to console
    ** The method is used instead of System.out.println();
    */
    public void loggerConsole(String log) {
        FileHandler fh;
        try { 
            StreamHandler sh = new StreamHandler();
            SimpleFormatter formatter = new SimpleFormatter(); 
            sh.setFormatter(formatter);
            logger.addHandler(sh);  
            
            logger.info(log);
            sh.close();
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } 
    }
}
