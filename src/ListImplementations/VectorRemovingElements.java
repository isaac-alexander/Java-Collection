package ListImplementations;
// To remove an element from a Vector, we can use the remove() method. This method is overloaded to perform multiple operations based on different parameters. They are:
//
//remove(Object): Removes the first occurrence of the specified object.
//remove(int index): Removes the element at the given index and shifts remaining elements to the left.

import java.util.*;
import java.io.*;

public class VectorRemovingElements {

    static void main(String[] arg) {
        // Create default vector of capacity 10
        Vector v = new Vector();

        // Add elements using add() method
        v.add(1);
        v.add(2);
        v.add("Geeks");
        v.add("forGeeks");
        v.add(4);

        // Removing first occurrence element at 1
        v.remove(1);

        System.out.println("After removal: " + v);
    }
}
