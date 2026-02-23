package QueueDequeImplementation;
// To remove the elements from AbstractQueue, it provides remove() and clear() methods.
//
//The remove() method returns and removes the head of this queue.
//The clear() method removes all the elements from this queue. The queue will be empty after this call returns.

// Java program to illustrate the
// removal of elements from AbstractQueue

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueRemovingElements {
    static void main(String[] argv) throws Exception {
        // Since AbstractQueue is an abstract class
        // create object using LinkedBlockingQueue
        AbstractQueue<Integer> AQ1 = new LinkedBlockingQueue<Integer>();

        // Add elements using add method
        AQ1.add(10);
        AQ1.add(20);
        AQ1.add(30);
        AQ1.add(40);
        AQ1.add(50);

        // print the queue contents to the console
        System.out.println("AbstractQueue1 contains : " + AQ1);

        // Retrieves the head
        int head = AQ1.remove();

        // print the head element to the console
        System.out.println("head : " + head);

        // print the modified queue
        System.out.println("AbstractQueue1 after removal of head : " + AQ1);

        // remove all the elements
        AQ1.clear();

        // print the modified queue
        System.out.println("AbstractQueue1 : " + AQ1);
    }
}
// Output
//AbstractQueue1 contains : [10, 20, 30, 40, 50]
//head : 10
//AbstractQueue1 after removal of head : [20, 30, 40, 50]
//AbstractQueue1 : []
