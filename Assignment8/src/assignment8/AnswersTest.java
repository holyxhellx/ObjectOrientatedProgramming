/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Asger
 */
public class AnswersTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        //---------------- Question 3 ----------------------
        ArrayList<Person> lp = new ArrayList();
        lp.add(new Person("Bob", 1990));
        lp.add((Person) new Student("Cat", 1991));
        for (int i = 0 ; i < lp.size() ; i++) {
            System.out.println(lp.get(i).name());
        }
        
        //Question 3. c,d,e,f
        Person p = new Person("Bob", 1990);
        Student s = new Student("Cat", 1992); 
        //s = lp.get(1); //error
        s = (Student) lp.get(1);
        
        //Question 3. g,h
        ArrayList<Student> ls = new ArrayList();
        //ls = lp; //error: illigal
        
        //Question 3. i,j
        Map<String,Person> map = new HashMap<>();
        map.put("Bob", p);
        map.put("Cat", (Person) s);
        System.out.println(map.get("Bob"));
        System.out.println(map.get("Cat"));
        
        //---------------- Question 4 ----------------------
        
        //Create two linked lists: Integer & String elements
        MyIntegerLinkedList<Integer> intList = new MyIntegerLinkedList();
        MyIntegerLinkedList<String> strList = new MyIntegerLinkedList();
        
        //Add 3 elements to each list and print the lists
        intList.addFirst(1);
        intList.addFirst(2);
        intList.addLast(3);
        strList.addFirst("one");
        strList.addFirst("two");
        strList.addLast("three");
        intList.printList(); 
        strList.printList();
        
        //Remove the last element from IntegerList and print the list
        intList.removeLast();
        intList.printList();
        
        //Clear all elements from StringList and print the list
        strList.clearList();
        strList.printList();
        
        
        try {
            //Remove the last element from StringList
            strList.removeLast();      
        }
        catch (Exception e) { 
            System.out.println(e.getMessage()); 
        }
        
        try {
            //Remove the first element from StringList
            strList.removeFirst();
        }
        catch (Exception e) { 
            System.out.println(e.getMessage()); 
        }
        
        //Print the StringList
        strList.printList();
    }   
}
