package QueueDequeImplementation;
// To access elements from a priority queue, we can use the peek() method.

import java.util.*;

public class PriorityQueueAccessingElement {
    static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        System.out.println("PriorityQueue: " + pq);

        // Using the peek() method
        String element = pq.peek();
        System.out.println("Accessed Element: " + element);
    }
}
// Output
//PriorityQueue: [For, Geeks, Geeks]
//Accessed Element: F
