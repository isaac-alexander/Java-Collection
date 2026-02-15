package ListImplementations;

// Removes the first occurrence of the specified element from the list, if it exists. They are:
//
//remove(Object): Removes the first occurrence of the specified object from the LinkedList.
//remove(int index): Removes the element at the given index and shifts subsequent elements.

import java.util.*;

public class LinkedListRemovingElements {

    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        System.out.println("Initial LinkedList " + ll);

        // Function call
        ll.remove(1);

        System.out.println("After the Index Removal " + ll);

        ll.remove("Geeks");

        System.out.println("After the Object Removal "
                + ll);
    }
}
