package QueueDequeImplementation;

// To add elements into the AbstractQueue, it provides two methods. The add(E e) method inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions. It returns true upon success and throws an IllegalStateException if no space is currently available. The addAll(E e) method adds all the elements in the specified collection to this queue.

// Java program to illustrate the
// adding elements to the AbstractQueue

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueAddingElements {

    static void main(String[] argv) throws Exception {
        // Since AbstractQueue is an abstract class
        // create object using LinkedBlockingQueue
        AbstractQueue<Integer> AQ1 = new LinkedBlockingQueue<Integer>();

        // Populating AQ
        AQ1.add(10);
        AQ1.add(20);
        AQ1.add(30);
        AQ1.add(40);
        AQ1.add(50);

        // print AQ
        System.out.println("AbstractQueue contains : "
                + AQ1);

        // Since AbstractQueue is an abstract class
        // create object using LinkedBlockingQueue
        AbstractQueue<Integer> AQ2 = new LinkedBlockingQueue<Integer>();

        // print AQ2 initially
        System.out.println("AbstractQueue2 initially contains : " + AQ2);

        // adds elements of AQ1 in AQ2
        AQ2.addAll(AQ1);

        System.out.println("AbstractQueue1 after addition contains : " + AQ2);
    }
}
// Output
//AbstractQueue contains : [10, 20, 30, 40, 50]
//AbstractQueue2 initially contains : []
//AbstractQueue1 after addition contains : [10, 20, 30, 40, 50]
