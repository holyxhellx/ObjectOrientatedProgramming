/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.util.Iterator;

/**
 *
 * @author Asger
 * Sources: 
 * https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html
 * https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/code/LinkedList.java
 */
public class MyIntegerLinkedList<T> {    
    private Node<T> head;
    
    public MyIntegerLinkedList() {
       head = null; 
    }
    
    void addFirst(T element) {
        head = new Node<>(element, head);
    }
    T getFirst() throws Exception {
        if (head == null) throw new Exception("There is no elements in the list");
        else return head.getVal();
    }
    
    void removeFirst() throws Exception {
        if (head == null) throw new Exception("There is no elements in the list");
        else head = head.getNext();
    }
    
    void addLast(T element) {
        if (head == null) head = new Node<>(element, head);
        else {
            Node<T> tmp = head;
            while(tmp.next != null) tmp = tmp.next;
            tmp.next = new Node<T>(element, null);
        }
    }
    
    T getLast() throws Exception {
        if (head == null) throw new Exception("There is no elements in the list");
        else {
            Node<T> tmp = head;
            while(tmp.next != null) tmp = tmp.next;
            return tmp.getVal();
        }
    }
    
    void removeLast() throws Exception {
        if (head == null) throw new Exception("There is no elements in the list");
        Node<T> temp = head;
        Node<T> prev = null;
        while(temp.getNext() != null){
            prev = temp;
            temp = temp.getNext();
        }
        prev.next = null;
    }
    
    void clearList() {
        head = null;
    }
    
    public void printList() {
        if (head == null) System.out.println("No items in the list");
        Node<T> node = head;   
        while(node != null) {
            System.out.println(node.getVal());
            node = node.getNext();
        }
    }
    
    private class Node<AnyType> {
        private AnyType data;
        private Node<AnyType> next;

        public Node(AnyType data, Node<AnyType> next) {
            this.data = data;
            this.next = next;
        }
        
        public AnyType getVal() {
            return data;
        }
        
        public void setVal(AnyType data) {
            this.data = data;
        }

        public Node<AnyType> getNext() {
            return next;
        }

        public void setNext(Node<AnyType> next) {
            this.next = next;
        }
    }
    
    public LinkedListIterator iterator() {
        return new LinkedListIterator();
    }
    
    private class LinkedListIterator implements Iterator<T> {

        private Node<T> nextNode;
        
        private LinkedListIterator() {
            nextNode = head;
        }

        @Override
        public boolean hasNext() {
            return nextNode != null;
        }

        @Override
        public T next() {
            T nn = nextNode.data;
            nextNode = nextNode.getNext();
            return nextNode.getVal();
        }
    }
}
