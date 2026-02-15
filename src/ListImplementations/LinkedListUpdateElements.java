package ListImplementations;

// With the help of the set() method, we can update an element in a LinkedList. This method takes an index and the updated element which needs to be inserted at that index.

import java.util.*;

public class LinkedListUpdateElements {

    static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "Geeks");

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "For");

        System.out.println("Updated LinkedList " + ll);
    }
}
