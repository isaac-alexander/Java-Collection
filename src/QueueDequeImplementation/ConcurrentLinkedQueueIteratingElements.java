package QueueDequeImplementation;
// We can use the iterator() method of ConcurrentLinkedQueue which return an iterator that allows traversing through the elements of the queue in the FIFO order.

import java.util.*;
import java.util.concurrent.*;

public class ConcurrentLinkedQueueIteratingElements {

    static void main(String[] args) {
        // Create an instance of ConcurrentLinkedQueue
        ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();

        q.add("Java");
        q.add("C++");
        q.add("Python");
        q.add("js");

        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: " + q);

        // Call iterator() method
        Iterator i = q.iterator();

        // Print elements of iterator
        System.out.println("The String Values of iterator are:");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
// Output
//ConcurrentLinkedQueue: [Java, C++, Python, js]
//The String Values of iterator are:
//Java C++ Python js
