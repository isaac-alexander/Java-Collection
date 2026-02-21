package QueueDequeImplementation;
// We can use methods like getFirst(), getLast(), peek(), peekFirst(), peekLast() to access elements of the ArrayDeque.
import java.io.*;
import java.util.*;

public class ArrayDequeAccessingElements {

    static void main(String[] args) {
        // Creating an empty ArrayDeque
        ArrayDeque<String> d = new ArrayDeque<String>();

        // Using add() method to add elements into the Deque Custom input elements
        d.add("Welcome");
        d.add("To");
        d.add("Geeks");
        d.add("for");
        d.add("Geeks");

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque: " + d);

        // Displaying the First element
        System.out.println("The first element is: " + d.getFirst());

        // Displaying the Last element
        System.out.println("The last element is: " + d.getLast());
    }
}
// Output
//ArrayDeque: [Welcome, To, Geeks, for, Geeks]
//The first element is: Welcome
//The last element is: Geeks
