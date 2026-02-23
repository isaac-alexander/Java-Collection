package QueueDequeImplementation;
// We use add() and addAll() method to insert elements in a ConcurrentLinkedQueue.

import java.util.*;
import java.util.concurrent.*;

public class ConcurrentLinkedQueueAddingElements {

    static void main(String[] args) {
        // Create an instance of ConcurrentLinkedQueue
        ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();

        // Add String to queue using add method
        q.add("Java");
        q.add("C++");
        q.add("Python");
        q.add("Js");

        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: " + q);

        // create a ArrayList of Strings
        ArrayList<String> al = new ArrayList<String>();

        // add String to ArrayList
        al.add("Geek1");
        al.add("Geek2");
        al.add("Geek3");
        al.add("Geek4");
        al.add("Geek5");

        // Displaying the existing Collection
        System.out.println("Collection to be added: " + al);

        // apply addAll() method and passed arraylist as parameter
        boolean b = q.addAll(al);

        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("Collection added: " + b);

        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: " + q);
    }
}
// ConcurrentLinkedQueue: [Java, C++, Python, Js]
// Collection to be added: [Geek1, Geek2, Geek3, Geek4, Geek5]
// Collection added: true
// ConcurrentLinkedQueue: [Java, C++, Python, Js, Geek1, Geek2, Geek3, Geek4, Geek5]
