package QueueDequeImplementation;
// Use of ConcurrentLinkedQueue methods like peek(), poll() and size() to interact with and manipulate the queue.

import java.util.concurrent.*;

public class ConcurrentLinkedQueueExample2 {

    static void main(String[] args) {
        // Create a ConcurrentLinkedQueue using ConcurrentLinkedQueue() constructor
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<Integer>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println("ConcurrentLinkedQueue: " + q);

        // Displaying the first element using peek() method
        System.out.println("First Element is: " + q.peek());

        // Remove and display the first element using poll() method
        System.out.println("Head Element is: " + q.poll());

        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: " + q);

        // Get the size using size() method
        System.out.println("Size: " + q.size());
    }
}
// Output
// ConcurrentLinkedQueue: [10, 20, 30, 40]
// First Element is: 10
// Head Element is: 10
// ConcurrentLinkedQueue: [20, 30, 40]
// Size: 3
