package CoreInterface;

// Since a Deque can be iterated from both directions, the iterator method of the Deque interface provides us two ways to iterate. One from the first and the other from the back.

import java.util.*;

public class DequeInterfaceIteratingThroughTheDeque {

    static void main(String[] args) {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");
        dq.add("is so good");

        for (Iterator itr = dq.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        for (Iterator itr = dq.descendingIterator(); itr.hasNext(); ) {
            System.out.print(itr.next() + " ");
        }
    }
}
