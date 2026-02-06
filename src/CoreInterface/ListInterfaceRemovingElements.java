package CoreInterface;

// To remove an element from a list, we can use the remove() method. This method is overloaded to perform multiple operations based on different parameters.
//
//remove(Object o): Removes the first occurrence of the specified object from the list.
//remove(int index): Removes the element at the specified index and shifts subsequent elements left.


import java.util.ArrayList;
import java.util.List;

public class ListInterfaceRemovingElements {

    static void main(String[] args) {

        // Creating List class object
        List<String> al = new ArrayList<>();

        // Adding elements to the object Custom inputs
        al.add("Geeks");
        al.add("Geeks");

        // Adding For at 1st indexes
        al.add(1, "For");

        System.out.println("Initial ArrayList " + al);

        // Now remove element from the above list present at 1st index
        al.remove(1);

        System.out.println("After the Index Removal " + al);

        // Now remove the current object from the updated List
        al.remove("Geeks");

        System.out.println("After the Object Removal " + al);
    }
}
