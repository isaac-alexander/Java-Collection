package QueueDequeImplementation;
// We can use various methods like iterator(), descendingIterator() to iterate over the elements of ArrayDeque.

import java.util.*;

public class ArrayDequeIteratingElements {

    static void main(String[] args) {
        // Declaring and initializing an deque
        Deque<String> d = new ArrayDeque<String>();

        // Adding elements at the back using add() method
        d.add("For");

        // Adding element at the front using addFirst() method
        d.addFirst("Geeks");

        // add element at the last using addLast() method
        d.addLast("Geeks");
        d.add("is so good");

        // Iterate using Iterator interface from the front of the queue
        System.out.println("Iterating in ForwardOrder:");
        for (Iterator i = d.iterator(); i.hasNext(); ) {

            System.out.print(i.next() + " ");
        }

        System.out.println();

        // Iterate in reverse sequence in a queue
        System.out.println("Iterating in ReverseOrder:");
        for (Iterator i = d.descendingIterator();
             i.hasNext(); ) {

            System.out.print(i.next() + " ");
        }
    }
}
// Output
//Iterating in ForwardOrder:
//Geeks For Geeks is so good
//Iterating in ReverseOrder:
//is so good Geeks For Geeks
