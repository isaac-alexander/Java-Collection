package ListImplementations;

// There are multiple ways to iterate through LinkedList. The most famous ways are by using the basic for loop in combination with a get() method to get the element at a specific index and the advanced for-loop.

import java.util.*;

public class IteratingALinkedList {

    static void main(String[] args) {
        LinkedList<String> ll
                = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        // Using the Get method and the for loop
        for (int i = 0; i < ll.size(); i++) {

            System.out.print(ll.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : ll)
            System.out.print(str + " ");
    }
}
