package assignment3;

/**
 *
 * @author Asger
 */
public class OOPCourse {
    /*
    Question 6:
    Given the class Student() (the most simple one you have created) make it a 
    nested class of class OOPCourse that manages the OOP course. Come up with a 
    few methods for class OOPCourse and test them... Explaination follows:
    
    "I have already implemented a count-solution for every instance created."
    - Run TestStudent.java (Run project)
    
    "The tests used in Assignment 2 and small changes has been integrated along 
    in the abstract class 'abstractStudent' and is full supported with its own 
    main method."
    - Run abstractStudent.java
    
    "OOPCourse has its own main method and is for assignment 3 used to test
    this class."
    - Run OOPCourse.java
    */
    
    private static int countOPPCourse = 0; 
    private static int countStudent = 0;
    
    //Constructor
    public OOPCourse(){
        countOPPCourse++;
    }
    
    //Get number of Students/Courses:
    public static int getCountOPPCourses() { return countOPPCourse; } 
    public static void incrementCountStudent() { countStudent++; }
    public static int getCountStudent() { return countStudent; } 
    
    //Nested Class
    private class Student {
    
        //Constructor
        public Student(){
            OOPCourse.incrementCountStudent();
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

        //Compare class objects
        public boolean hasSameFluencyInJavaAs(Student anotherStudent){
            if(this.proficiencyInJava == anotherStudent.proficiencyInJava) return true;
            else return false;
        }

        public void studentsWithProficiency(int proficiency) { if (this.proficiencyInJava == proficiency) System.out.println(this.name + " has proficiency " + proficiency); }

        //Print student object
        public void printStudent() { 
            System.out.println("name: " + this.name + " group: " + this.group + " ProficiencyInJava: " + this.proficiencyInJava + " cprNumber: " + this.cprNumber + " Gender: " + this.gender);
        }

        //return average grade
        public float averageNote() {
            return ((this.objectOrientatedProgramming + this.project + this.scalability + this.thesisPrep) / 4);
        }  
    }
    
    public static void main(String[] args) {
       
        /* READ FROM INPUT
         * input: "TA1 TA3 ST3 TA4 PHD6 PHD8"
         */
        String input = "ST1 ST4 ST2";
        String[] inputArr = input.split("\\s+");
        
        OOPCourse OOP = new OOPCourse();
        
        int count = inputArr.length;
        for (int i = 0 ; i < count ; i++ ) {
            String line = inputArr[i];
            
            if (line.contains("ST")) { 
                Student student = OOP.new Student();
                student.setName("New ST student" +Integer.toString(i));
                student.setGroup(53); //not jet in a group (1 or 2)
                student.setProficiencyInJava(0);
                student.setCprNumber(1234000007 + i);
                student.setGender("nn");
                student.printStudent();
            }
        }

        //Number of student created in total:
        System.out.println("Number of OOPCourses: " + OOPCourse.getCountOPPCourses());
        System.out.println("Number of Students: " + OOPCourse.getCountStudent());
    }
}

