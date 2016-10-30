/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author Asger
 */
public class Task2 {
/*
    Design by Contract with JML
    The Design by Contract (DBC is a way of recording details of method 
    liability and avoiding use of time on argument control. The setup of
    contracts in software for a method is done by telling about the client and 
    implementor from the perspective of obligations and rights.
    
    Eks: A simple method for returning the square root of number
    The obligation from the client should always be to supple the method with 
    possitive numbers. The obligation from the Implementor is to compute and 
    return the square root. If the client accept the conditions of the 
    obligations it will get the square root returned. The same goes for the 
    implementor which has the rights to assume from the clients obligations that 
    no argument passed will be non-negative and will return the square root to 
    the client.
    
    The definition of a precondition is the statement of what must be true for 
    the client to call it. The postcondition states what is true after the 
    method returns(no exeption throwed) along with the states of what is true 
    should the method throw an execption.
    
    Eks: preconditions and postconditions for the method which use spaure root.
    Precondition : // assert x >= 0  (9.0)
    Method:        // double result = sqrt(9.0);
    Postcondition: // assert result * result = x  (result == 3.0)

    The constracts can be done by documentation as well. The documentation will 
    state what is required and ensured by each method. One major advantage of 
    Design by Contract overall is ablility of the client to know who to blame 
    if the preconditions or postconditions does not hold. 
    
    The Java Modeling Language (JML) is the specification for the behavior of 
    interface. The specifications are contained as annotations. Eks:
    (The at-signs are ignored by annotations)
    //@ ...
    
    and
    
    /*@ ...
      @ ...
      @ ...
      @ ...
    */
/*
    
    The Meaning of Postconditions ensures a normal return or a exception thrown 
    if arguments of the condition is not met.
   
*/
}
