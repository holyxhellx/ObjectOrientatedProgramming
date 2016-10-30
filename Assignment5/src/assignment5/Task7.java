/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Asger
 * This program runs using the arguments provided in the project properties
 * Argument: 6 2 
 * 6 = args[0]
 * 2 = args[1]
 */
public class Task7 {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Arguments not provided");
        } else {
            try{
                int a=Integer.parseInt(args[0]);
                int b=Integer.parseInt(args[1]);
            } catch (NumberFormatException ex) {
                System.out.println(ex + " Argument are not an integer"); 
            }
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int result = aDividedByb(a, b);
            System.out.println(result);
        }
    }
    /*
     *  The supplied arguments should throw IllegalArgumentException instead of 
     *  ArithmeticException if the divider is zero.
     *  http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/IllegalArgumentException.html
     */
    private static int aDividedByb(int a, int b) {
        if (b == 0) throw new ArithmeticException("Argument 'divisor' is 0");
        return a/b;
    }
}
