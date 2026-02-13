package CoreInterface;

// To remove an element from a queue, we can use the remove() method. If there are multiple objects, then the first occurrence of the object is removed. The poll() method is also used to remove the head and return it.

import java.util.*;

public class QueueInterfaceRemovingElements {

    static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial Queue: " + pq);

        pq.remove("Geeks");

        System.out.println("After Remove: " + pq);

        System.out.println("Poll Method: " + pq.poll());

        System.out.println("Final Queue: " + pq);
    }
}
