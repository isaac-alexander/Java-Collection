package SetImplementation;

// To add an element to the HashSet, we can use the add() method. However, the insertion order is not retained in the HashSet. We need to keep a note that duplicate elements are not allowed and all duplicate elements are ignored.

import java.util.*;

public class HashSetAddingElements {

    static void main(String[] args) {
        // Creating an empty HashSet of string entities
        HashSet<String> hs = new HashSet<String>();

        // Adding elements using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");

        System.out.println("HashSet : " + hs);
    }
}
