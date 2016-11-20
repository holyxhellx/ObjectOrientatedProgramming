/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

/**
 *
 * @author Asger
 */
public class IntegerOnlyExtended {
    int i = 0; //data
    
    public IntegerOnlyExtended() {
        i = 0;
    }
    
    public /*synchronized*/ void increment(){
        i++;
    }
    
    public /*synchronized*/ int getInteger() {
        return i;
    }
}
