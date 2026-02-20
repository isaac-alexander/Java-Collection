package SetImplementation;
// The values can be removed from the SortedSet using the remove() method.

import java.util.*;

public class SortedSetRemovingElements {

    static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("B");
        ts.add("D");
        ts.add("E");

        System.out.println("Initial TreeSet: " + ts);

        // Removing the element b
        ts.remove("B");

        System.out.println("After removing element: " + ts);
    }
}
