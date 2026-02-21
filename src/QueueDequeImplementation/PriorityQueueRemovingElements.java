package QueueDequeImplementation;
// To remove an element from a priority queue, we can use the remove() method.

import java.util.*;
import java.io.*;

public class PriorityQueueRemovingElements {

    static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial PriorityQueue " + pq);

        // using the method
        pq.remove("Geeks");

        System.out.println("After Remove: " + pq);

        System.out.println("Poll Method: " + pq.poll());

        System.out.println("Final PriorityQueue: " + pq);
    }
}
// Output
//Initial PriorityQueue [For, Geeks, Geeks]
//After Remove: [For, Geeks]
//Poll Method: For
//Final PriorityQueue: [Geeks]
