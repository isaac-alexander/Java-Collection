package ListImplementations;

// There are multiple ways to iterate through the Vector. The most famous ways are by using the basic for loop in combination with a get() method to get the element at a specific index and the advanced for a loop.

import java.util.*;

public class VectorIterating {

    static void main(String[] args) {
        // create an instance of vector
        Vector<String> v = new Vector<>();

        // Add elements using add() method
        v.add("Geeks");
        v.add("Geeks");
        v.add(1, "For");

        // Using the Get method and the for loop
        for (int i = 0; i < v.size(); i++) {

            System.out.print(v.get(i) + " ");
        }

        System.out.println();


        for (String str : v)
            System.out.print(str + " ");
    }
}
