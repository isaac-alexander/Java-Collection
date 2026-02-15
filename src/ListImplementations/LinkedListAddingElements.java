package ListImplementations;

// With the help of the add() method, we can add elements to a LinkedList This method can perform multiple operations based on different parameters. They are:
//
//add(Object): This method is used to add an element at the end of the LinkedList.
//add(int index, Object): This method is used to add an element at a specific index in the LinkedList.

import java.util.*;

public class LinkedListAddingElements {

    static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        System.out.println(ll);
    }
}
