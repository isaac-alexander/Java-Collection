package QueueDequeImplementation;
// There are multiple ways to iterate through the PriorityQueue. The most famous way is converting the queue to the array and traversing using an iterator. Iterator does not traverse in priority order.

import java.util.*;

public class PriorityQueueIteratingElements {

    static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
// Output
//For Geeks Geeks
