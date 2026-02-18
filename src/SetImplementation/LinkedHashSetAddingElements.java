package SetImplementation;
// In order to add an element to the LinkedHashSet, we can use the add() method. This is different from HashSet because in HashSet, the insertion order is not retained but is retained in the LinkedHashSet.

import java.io.*;
import java.util.*;

public class LinkedHashSetAddingElements {

    static void main(String[] args) {

        // Creating an empty LinkedHashSet
        LinkedHashSet<String> lh = new LinkedHashSet<String>();

        // Adding elements to above Set using add() method
        lh.add("Geek");
        lh.add("For");
        lh.add("Geeks");

        System.out.println("LinkedHashSet : " + lh);
    }
}
