package SetImplementation;
//To add elements to a SortedSet, use the add() method.In a TreeSet, elements are automatically sorted in ascending order, duplicates are ignored, and null values are not allowed.

import java.util.*;

public class SortedSetAddingElements {

    static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");

        System.out.println(ts);
    }
}
