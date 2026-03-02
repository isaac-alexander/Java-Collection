package UtilityAndSupportingClasses;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassSortingElements {

    static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");

        // Sorting the list in ascending order
        Collections.sort(fruits);

        // Print sorted list
        System.out.println("After Sorting: " + fruits);
    }
}
// Output
//After Sorting: [Apple, Banana, Grapes, Mango]

//Explanation:

//Creates an ArrayList named fruits.
//Adds multiple fruit names to the list.
//Collections.sort(fruits) sorts elements in ascending (natural) order.

