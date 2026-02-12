package CoreInterface;
// To check if an element is present in the list, we can use the contains() method. This method returns true if the specified element is present in the list, otherwise, it returns false.
//
//contains(Object o): This method takes a single parameter, the object to be checked if it is present in the list.

import java.util.*;

public class ListInterfaceContainsElement {
    static void main(String[] args) {

        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface
        al.add("Geeks");
        al.add("For");
        al.add("Geeks");

        // Checking if element is present using contains() method
        boolean isPresent = al.contains("Geeks");

        // Printing the result
        System.out.println("Is Geeks present in the list? " + isPresent);
    }
}
