package CoreInterface;

// For larger datasets, Lists can be iterated using:
//
//Basic for loop with get(index)
//Enhanced for-each loop
//These methods allow efficient traversal of elements.

import java.util.*;

public class ListInterfaceIterating {

    static void main(String[] args) {
        // Creating an empty Arraylist of string type
        List<String> al = new ArrayList<>();

        // Adding elements to above object of ArrayList
        al.add("Geeks");
        al.add("Geeks");

        // Adding element at specified position inside list object
        al.add(1, "For");

        // Using  for loop for iteration
        for (int i = 0; i < al.size(); i++) {

            // Using get() method to access particular element
            System.out.print(al.get(i) + " ");
        }

        // New line for better readability
        System.out.println();

        // Using for-each loop for iteration
        for (String str : al)

            System.out.print(str + " ");
    }
}