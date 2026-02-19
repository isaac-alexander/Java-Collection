package SetImplementation;
// The values can be removed from the TreeSet using the remove() method. There are various other methods that are used to remove the first value or the last value.

import java.util.*;

public class TreeSetRemovingElements {

    static void main(String[] args) {

        // Creating an object of NavigableSet with reference
        // to TreeSet class
        NavigableSet<String> ts = new TreeSet<>();

        // Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        System.out.println("Initial TreeSet " + ts);

        // Removing a specific existing element inserted
        // above
        ts.remove("B");

        // Printing the updated TreeSet
        System.out.println("After removing element " + ts);

        // Now removing the first element using pollFirst()
        // method
        ts.pollFirst();

        // Again printing the updated TreeSet
        System.out.println("After removing first " + ts);

        // Removing the last element using pollLast() method
        ts.pollLast();

        System.out.println("After removing last " + ts);
    }
}
