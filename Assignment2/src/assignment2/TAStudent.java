/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Asger
 */
public class TAStudent {
    
    //Object Variables
    private String name = "";
    private int group = 0;
    private int proficiencyInJava = 0;
    private int cprNumber = 0;
    private String gender = "";
    
    //Getters and Setters
    /**
     *
     * @return
     */
    public String getName() { return this.name; }

    /**
     *
     * @param Newname
     */
    public void setName(String Newname) { this.name = Newname; }
   
    /**
     *
     * @return
     */
    public int getGroup() { return this.group; }

    /**
     *
     * @param group
     */
    public void setGroup(int group) { this.group = group; }
    
    /**
     *
     * @return
     */
    public int getProficiencyInJava() { return this.proficiencyInJava; }

    /**
     *
     * @param proficiencyInJava
     */
    public void setProficiencyInJava(int proficiencyInJava) { this.proficiencyInJava = proficiencyInJava; }
    
    /**
     *
     * @param cprNumber
     * @return
     */
    public int getCprNumber(int cprNumber) { return this.cprNumber; }

    /**
     *
     * @param cprNumber
     */
    public void setCprNumber(int cprNumber) { this.cprNumber = cprNumber; }
    
    /**
     *
     * @return
     */
    public String getGender() { return this.gender; }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) { this.gender = gender; }
    
    /**
     * Print TAStudent object
     */
    public void printTAStudent() { 
        System.out.println("name: " + this.name + " group: " + this.group + " ProficiencyInJava: " + this.proficiencyInJava + " cprNumber: " + this.cprNumber + " Gender: " + this.gender);
    }
}
