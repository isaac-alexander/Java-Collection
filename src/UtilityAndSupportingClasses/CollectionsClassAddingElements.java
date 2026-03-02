package UtilityAndSupportingClasses;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassAddingElements {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        Collections.addAll(list, "Mango", "Grapes");
        System.out.println("After Adding: " + list);
    }
}
// Output
//After Adding: [Apple, Banana, Mango, Grapes]

// Explanation
//
//Creates an ArrayList to store String elements dynamically.
//Adds elements using add() and multiple elements at once using Collections.addAll().
//Maintains insertion order and allows duplicates.
