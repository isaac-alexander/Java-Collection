package CoreInterface;

// To add an element to the list, we can use the add() method. This method is overloaded to perform multiple operations based on different parameters.
//
//add(Object o): This method is used to add an element at the end of the List.
//add(int index, Object o): This method is used to add an element at a specific index in the List

import java.util.*;

public class ListInterfaceAddingElements {

    static void main(String[] args) {
        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface Custom elements
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println(al);
    }
}
