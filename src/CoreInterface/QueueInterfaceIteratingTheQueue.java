package CoreInterface;

//There are multiple ways to iterate through the Queue. The most famous way is converting the queue to the array and traversing using the for loop. The queue has also an inbuilt iterator which can be used to iterate through the queue.

import java.util.*;

public class QueueInterfaceIteratingTheQueue {

    static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
