package CoreInterface;

// Searching in a List can be done using indexOf(), lastIndexOf() methods.
//
//indexOf(Object o): It returns the index of the first occurrence of the specified element in the list or -1 if the element is not found
//lastIndexOf(Object o): It returns the index of the last occurrence of the specified element in the list or -1 if the element is not found

import java.util.*;

public class ListInterfaceSearchingElements {

    static void main(String[] args) {
        // create a list of integers
        List<Integer> al = new ArrayList<>();

        // add some integers to the list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);

        // use indexOf() to find the first occurrence of an element in the list
        int i = al.indexOf(2);

        System.out.println("First Occurrence of 2 is at Index: " + i);

        // use lastIndexOf() to find the last occurrence of an element in the list
        int l = al.lastIndexOf(2);

        System.out.println("Last Occurrence of 2 is at Index: " + l);
    }
}
