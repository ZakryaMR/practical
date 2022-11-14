/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 *
 * @author Aryan Soft
 */
//    The ArrayDeque class provides the facility of using deque and resizable-array.
//    It inherits AbstractCollection class and implements the Deque interface.
//
//    The important points about ArrayDeque class are:
//
//    Unlike Queue, we can add or remove elements from both sides.
//    Null elements are not allowed in the ArrayDeque.
//    ArrayDeque is not thread safe, in the absence of external synchronization.
//    ArrayDeque has no capacity restrictions.
//    ArrayDeque is faster than LinkedList and Stack.
public class Deque_inJava {
    public static void main(String[] args){
        Deque<String> dq=new ArrayDeque<String>();
        
        dq.add("Zikrya");
        dq.addFirst("Mosaddiq");
        dq.addLast("Mokhtar");
        System.out.println("dequeue's head(getellement): throw exception if q is empty : "+dq.element());
        System.out.println("dequeue's head(getfirst): throw exception if q is empty : "+dq.getFirst());
        System.out.println("dequeue's head(peek): not throw exception if q is empty : "+dq.peek());
        System.out.println("dequeue's head(peekfirst): not throw exception if q is empty : "+dq.peekFirst());
        System.out.println("dequeue's tail(getlast): throw exception if q is empty : "+dq.getLast());
        System.out.println("dequeue's tail(peeklast): not throw exception if q is empty : "+dq.peekLast());
        Iterator i=dq.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        System.out.println("retrived and removed head(poll) : not throw exception if q is empty : "+dq.poll());
        System.out.println("retrived and removed head(remove) : throw exception if q is empty : "+dq.remove());
        i=dq.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        
    }
}
