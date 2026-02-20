package SetImplementation;
// There are various ways to iterate through the SortedSet. The most famous one is to use the enhanced for loop.

import java.util.*;

public class SortedSetIteratingElements {
    static void main(String[] args) {
        SortedSet<String> ts
                = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        // Iterating though the SortedSet
        for (String value : ts)
            System.out.print(value
                    + ", ");
        System.out.println();
    }
}