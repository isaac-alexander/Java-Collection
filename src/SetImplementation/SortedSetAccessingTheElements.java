package SetImplementation;
// We can access elements using methods such as contains(), first(), last(), etc.

import java.util.*;

public class SortedSetAccessingTheElements {

    static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");

        System.out.println("Sorted Set is: " + ts);

        String check = "D";

        // Check if the above string exists in the SortedSet or not
        System.out.println("Contains: " + check + " "
                + ts.contains(check));

        // Print the first element in the SortedSet
        System.out.println("First Value: " + ts.first());

        // Print the last element in the SortedSet
        System.out.println("Last Value: " + ts.last());
    }
}

// Output
//Sorted Set is: [A, B, C]
//Contains: D false
//First Value: A
//Last Value: C