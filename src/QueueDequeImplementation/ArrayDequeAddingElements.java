package QueueDequeImplementation;
// We can use methods like add(), addFirst(), addLast(), offer(), offerFirst(), offerLast() to insert element to the ArrayDeque.

import java.io.*;
import java.util.*;

public class ArrayDequeAddingElements {

    static void main(String[] args) {
        // Initializing a deque since deque is an interface. it is assigned the ArrayDeque class
        Deque<String> d = new ArrayDeque<String>();

        // add() method to insert
        d.add("The");
        d.addFirst("To");
        d.addLast("Geeks");

        // offer() method to insert
        d.offer("For");
        d.offerFirst("Welcome");
        d.offerLast("Geeks");

        System.out.println("ArrayDeque : " + d);
    }
}
// Output
//ArrayDeque : [Welcome, To, The, Geeks, For, Geeks]
