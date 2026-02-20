package SetImplementation;

// The values can be removed from the NavigableSet using the remove(), pollFirst(), pollLast().
//
//Example: This example demonstrates removing elements from the NavigableSet.

// Java Program to demonstrates the working of remove(),
// pollFirst() and pollLast() method
import java.io.*;
import java.util.*;

public class NavigableSetRemovingElements {

    static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("B");
        ts.add("D");
        ts.add("E");

        System.out.println("NavigableSet: " + ts);

        // Removing the element b
        ts.remove("B");

        System.out.println("After removing element " + ts);

        // Remove the First element of TreeSet
        ts.pollFirst();

        System.out.println(
                "After the removal of First Element " + ts);

        // Remove the Last element of TreeSet
        ts.pollLast();

        System.out.println(
                "After the removal of Last Element " + ts);
    }
}
// Output
//NavigableSet: [A, B, C, D, E]
//After removing element [A, C, D, E]
//After the removal of First Element [C, D, E]
//After the removal of Last Element [C, D]
