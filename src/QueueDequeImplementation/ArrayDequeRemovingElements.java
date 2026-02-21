package QueueDequeImplementation;
// We can use various methods like remove(), removeFirst(), removeLast(), poll(), pollFirst(), pollLast(), pop() to remove elements from the ArrayDeque.

import java.util.*;

public class ArrayDequeRemovingElements {

    static void main(String[] args) {

        // Initializing a deque
        Deque<String> d = new ArrayDeque<String>();

        // Adding elements
        d.add("Java");
        d.addFirst("C++");
        d.addLast("Python");

        // Printing initial elements
        System.out.println("Initial Deque: " + d);

        // Removing elements as a stack from top/front
        System.out.println("Removed element using pop(): " + d.pop());

        // Removing an element from the front
        System.out.println("Removed element using poll(): " + d.poll());

        // Removing an element from the front using pollFirst
        System.out.println("Removed element using pollFirst(): " + d.pollFirst());

        // The deque is empty now
        System.out.println("Final Deque: " + d);
    }
}
//Output
//Initial Deque: [C++, Java, Python]
//Removed element using pop(): C++
//Removed element using poll(): Java
//Removed element using pollFirst(): Python
//Final Deque: []
