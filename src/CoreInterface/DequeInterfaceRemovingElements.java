package CoreInterface;

// Elements can be removed from both ends using removeFirst(), removeLast(), pop(), or poll() variants; pop() throws an exception if empty, while poll() is safe.

import java.util.*;

public class DequeInterfaceRemovingElements {

    static void main(String[] args) {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);

        System.out.println(dq.pop());

        System.out.println(dq.poll());

        System.out.println(dq.pollFirst());

        System.out.println(dq.pollLast());
    }
}
