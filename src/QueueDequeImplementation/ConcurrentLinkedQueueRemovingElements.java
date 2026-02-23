package QueueDequeImplementation;
// We can use remove() to remove elements from the ConcurrentLinkedQueue.

import java.util.concurrent.*;

public class ConcurrentLinkedQueueRemovingElements {

    static void main(String[] args) {
        // Create an instance of ConcurrentLinkedQueue
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<Integer>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("ConcurrentLinkedQueue: " + q);

        // apply remove() for Number 78249
        boolean b = q.remove(20);

        System.out.println("number 20 remove successfully? : " + b);

        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("Updated ConcurrentLinkedQueue: " + q);
    }
}
// Output
//ConcurrentLinkedQueue: [10, 20, 30, 40]
//number 20 remove successfully? : true
//Updated ConcurrentLinkedQueue: [10, 30, 40]
