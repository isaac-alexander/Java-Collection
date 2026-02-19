package SetImplementation;

// To add elements to a TreeSet, use the add() method. Elements are stored in ascending order, duplicates are ignored, and null values are not allowed.

import java.util.*;

public class TreeSetAddingElements {

    static void main(String[] args) {
        // Creating a Set interface with reference to TreeSet class
        Set<String> ts = new TreeSet<>();

        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");

        // Print all elements inside object
        System.out.println(ts);
    }
}