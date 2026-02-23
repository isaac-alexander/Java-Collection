package QueueDequeImplementation;
// We can use peek() and element() to access the elements of ConcurrentLinkedQueue.

import java.util.concurrent.*;

public class ConcurrentLinkedQueueAccessingElements {

    static void main(String[] args) throws IllegalStateException {
        // Create an instance of ConcurrentLinkedQueue
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();

        // Add numbers to end of Queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("Queue: " + q);

        // print head using element()
        System.out.println("Queue's head: " + q.element());

        // print head using peek()
        System.out.println("Queue's head: " + q.peek());
    }
}
// Output
//Queue: [10, 20, 30, 40]
//Queue's head: 10
//Queue's head: 10
