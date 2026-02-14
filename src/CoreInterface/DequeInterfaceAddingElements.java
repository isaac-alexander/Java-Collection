package CoreInterface;

// To add elements in a Deque, you can use add() , addFirst(), or addLast(), allowing insertion at either end, unlike a standard Queue which only adds at the tail.

import java.util.*;

public class DequeInterfaceAddingElements {

    static void main(String[] args) {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);
    }
}
