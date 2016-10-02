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
public class TestStudent {

    public static void main(String[] args) {
       
        /* READ FROM INPUT
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
                taStudent.printStudent();
            }
            else {
                PhDStudent phDStudent = new PhDStudent();
                phDStudent.setName("New Ph Student" +Integer.toString(i));
                phDStudent.setGroup(4); //group 4 i reserve for PhD
                phDStudent.setProficiencyInJava(500);
                phDStudent.setCprNumber(1234000007 + i);
                phDStudent.setGender("nn");
                phDStudent.printStudent();
            }
        }
        
        //Test of student created in total from the input file
        System.out.println("Number of Students: " + Student.getCountStudents());
        System.out.println("Number of TAStudents: " + TAStudent.getCountTAStudents());
        System.out.println("Number of PhDStudents: " + PhDStudent.getCountPhDStudents());
        System.out.println("Number of Students in total: " + abstractStudent.getObjectCount());
        if (( Student.getCountStudents() + TAStudent.getCountTAStudents() + PhDStudent.getCountPhDStudents() ) == abstractStudent.getObjectCount()) {
            System.out.println("Test of Student count success");
        } else System.out.println("Test of Student count failed"); 
    }
}
