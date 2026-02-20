package SetImplementation;
// We can use the add() method to insert elements to the NavigableSet. Elements are stored in the sorted order, no duplicates are allowed and null values are also not accepted by the NavigableSet.
//
//Example: This example demonstrates adding elements to a NavigableSet using add(), where duplicates are ignored and the elements are sorted in ascending order.

import java.util.*;
import java.io.*;

public class NavigableSetAddingElements {

    static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");

        System.out.println("NavigableSet: " + ts);
    }
}
// NavigableSet: [A, B, C]