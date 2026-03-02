package UtilityAndSupportingClasses;

import java.util.ArrayList;

public class CollectionsClassSearchingElements {
    static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Searching for an element
        if (list.contains("Mango")) {
            System.out.println("Mango is present in the list");
        }
    }
}
// Output
//Mango is present in the list

//Explanation

//Creates an ArrayList to store String elements.
//Adds elements using the add() method.
//contains("Mango") checks whether "Mango" exists in the list.
//Prints a message if the element is found.
