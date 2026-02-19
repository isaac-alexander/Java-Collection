package SetImplementation;
// There are various ways to iterate through the TreeSet. The most famous one is to use the enhanced for loop.

import java.util.*;

public class TreeSetIteratingElements {

    static void main(String[] args) {

        // Creating an object of Set with reference to
        // TreeSet class
        Set<String> ts = new TreeSet<>();

        // Adding elements in above object using add()
        // method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        for (String value : ts)
            System.out.print(value + ", ");

        System.out.println();
    }
}
