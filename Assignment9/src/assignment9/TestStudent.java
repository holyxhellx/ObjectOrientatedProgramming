/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 *
 * @author Asger
 */
public class TestStudent {
    //Question 5 - Student extend with timer thread
    public static void main(String[] args) {
        Student s = createStudent();
        //This only runs if the createStudent returns before the timer runs out.
        System.out.println("You have succesfully created a Student");
    }
    
    public static Student createStudent() {
        Student s = null;
        Thread timer = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(58593);
                    System.out.println("Your time has run out!");
                    System.exit(0);
                } catch (InterruptedException ex) {
                    System.out.println("The timer has been stopped");
                    //ex.printStackTrace();
                }
            }
        };
        System.out.println("You have about 1 min. to create a student obejct - Press Enter to continue:");
        Scanner scanner = new Scanner(System.in);
        timer.start();
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
        timer.interrupt();
        return s;
    } 
}
