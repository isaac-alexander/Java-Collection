package SetImplementation;
// After adding the elements, if we wish to access the elements, we can use inbuilt methods like contains(), first(), last(), etc.
//
//Example: This example demonstrates adding elements to a NavigableSet, checking for an element's existence, and retrieving the first and last elements.

// Java program to demonstrates the working of contains(), first() and last() method
import java.util.*;
import java.io.*;

public class NavigableSetAccessingElements {

    class Geeks {

        public static void main(String[] args) {
            NavigableSet<String> ts = new TreeSet<String>();

            // Elements are added using add() method
            ts.add("A");
            ts.add("B");
            ts.add("C");
            ts.add("A");

            System.out.println("NavigableSet: " + ts);

            String s = "D";

            // Check if the above string exists in
            // the NavigableSet or not
            System.out.println("D exists in the NavigableSet?: "
                    + ts.contains(s));

            // Print the first element in
            // the NavigableSet
            System.out.println("First Element of NavigableSet: "
                    + ts.first());

            // Print the last element in
            // the NavigableSet
            System.out.println("Last Element of NavigableSet: "
                    + ts.last());
        }
    }
}
// Output
//NavigableSet: [A, B, C]
//D exists in the NavigableSet?: false
//First Element of NavigableSet: A
//Last Element of NavigableSet: C