package UtilityAndSupportingClasses;

import java.util.ArrayList;

public class CollectionsClassDeletingElements {

    static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grapes");

        // Remove element by value
        list.remove("Banana");

        // Remove element by index
        list.remove(0);

        // Print final list
        System.out.println("After Removing: " + list);
    }
}
// Output
//After Removing: [Mango, Grapes]


//Explanation
//
//Creates an ArrayList to store string elements dynamically.
//remove("Banana") deletes an element by value, while remove(0) deletes by index.
//Elements automatically shift after removal.
//Prints the updated list.
