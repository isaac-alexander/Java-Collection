package SetImplementation;
// here are various ways to iterate through the NavigableSet. The most famous one is to use the enhanced for loop.
//
//Example: This example demonstrates adding elements to a NavigableSet and iterating through it in ascending order.

// Java Program to iterate through NavigableSet
import java.util.*;
import java.io.*;

public class NavigableSetIteratingElements {

    static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        // Iterating though the NavigableSet
        for (String i : ts)
            System.out.print(i + ", ");
    }
}
// Output
//A, B, C, D, E, Z,