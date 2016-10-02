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
public class Answers {
    //This class is only for answering questions from the Assignment:
        
    /* Question 2:
    *  I have implemented the abstract class because all instances no matter if 
    *  they are a PhD, TA and ST have a commen ground as a person with name, 
    *  cpr etc. The abstract class may only extend one class, where an interface 
    *  can implement serverel - But the Abstract class may implement serverel 
    *  interfaces. Conclusion: I would need more information to say if one 
    *  approch would be better than the other.
    */
    
    /* Question 3:
    *  • sInt = null;
    *  The implememtation of StudentInterface can have the value of sInt = null
    *    
    *  • sInt = student;
    *  The implememtation of StudentInterface can have that the value of sInt = student;
    *      
    *  • student = sInt;
    *  • sInt = new StudentInterface();
    *  • sInt.someMethodInStudentInterface();
    *  The IDE makes a "Thermal Neclear Penguin" (and explodes), because the 
    *  Student object cannot be an interface.
    */
    
    /* Question 4:
    *  No it does not compile, because ClassOneExtend needs a constructor with 
    *  the initialized variable as well. Easiest fix would the super(anotherVar)
    *  insite of the constructor of ClassOneExtend.
    */
    
    /* Question 5:
    *  1. The output of t.display() & te.display() is both : 23
    *  2. It is not possible to write a getter and setter method with different
    *     return types.
    *  3. The output of t.displayWithGet() will give 23 & te.displayWithGet()
    *     will give "hello world".
    */
}
