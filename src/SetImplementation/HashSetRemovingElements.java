package SetImplementation;
// The values can be removed from the HashSet using the remove() method.

import java.util.*;

public class HashSetRemovingElements {
    static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();

        // Adding elements to above Set using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        System.out.println("HashSet : " + hs);

        // Removing the element B
        hs.remove("B");

        // Printing the updated HashSet elements
        System.out.println("HashSet after removing element : " + hs);

        // Returns false if the element is not present
        System.out.println("B exists in Set : " + hs.remove("B"));
    }
}
