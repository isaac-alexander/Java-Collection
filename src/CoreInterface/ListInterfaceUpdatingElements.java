package CoreInterface;

// To update an element in a list, use the set() method with the target index and the new value. Since List is indexed, the element is replaced at the specified position.

import java.util.*;

public class ListInterfaceUpdatingElements {

    static void main(String[] args) {
        // Creating an object of List interface
        List<String> al = new ArrayList<>();

        // Adding elements to object of List class
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "Geeks");

        System.out.println("Initial ArrayList " + al);

        // Setting (updating) element at 1st index using set() method
        al.set(1, "For");

        System.out.println("Updated ArrayList " + al);
    }
}