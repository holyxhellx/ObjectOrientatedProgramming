package assignment7;
public class LinkedListTest {
    public static void main(String[] args) throws Exception {
        //-------------------- Question 5 --------------------------------------
        //create a linked list
        MyIntegerLinkedList<Integer> intList = new MyIntegerLinkedList();
        //add a few elements to the list and then print out its elements
        intList.insertHead(2);
        intList.insertHead(1);
        intList.insertTail(3);
        intList.printList();    // result = 1 , 2 , 3
        //remove the last element from the list and then print out the list
        intList.removeTail();
        intList.printList();    //result = 1 , 2
        //remove all elements from the list and then print out the list
        intList.clearList();
        intList.printList();    //Error: no element in list
   
        try {
            //remove one more element from the list (the list should be empty!)
            intList.removeHead();   //Error: no element in list
        }
        catch (Exception e) { 
            System.out.println(e.getMessage()); 
        }
        //add a few elements to the list and print them out
        intList.insertHead(2);
        intList.insertHead(3);
        intList.insertTail(1);
        intList.printList();
    }   
}
