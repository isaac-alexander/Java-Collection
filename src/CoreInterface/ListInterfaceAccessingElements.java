package CoreInterface;

// To access an element in the list, we can use the get() method, which returns the element at the specified index.
//
//get(int index): This method returns the element at the specified index in the list.

import java.util.*;


public class ListInterfaceAccessingElements {

    static void main(String[] args) {

        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface
        al.add("Geeks");
        al.add("For");
        al.add("Geeks");

        // Accessing elements using get() method
        String first = al.get(0);
        String second = al.get(1);
        String third = al.get(2);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(al);
    }
}
