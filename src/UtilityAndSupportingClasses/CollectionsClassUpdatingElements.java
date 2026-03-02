package UtilityAndSupportingClasses;

import java.util.ArrayList;

public class CollectionsClassUpdatingElements {

    static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Updating element at index 0
        list.set(0, "Orange");

        // Print updated list
        System.out.println("After Updating: " + list);
    }
}
// Output
//After Updating: [Orange, Banana, Mango]

//Explanation

//Creates an ArrayList to store String elements.
//Adds elements using add() method.
//set(0, "Orange") replaces the element at index 0.
