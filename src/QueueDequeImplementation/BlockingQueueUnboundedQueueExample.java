package QueueDequeImplementation;
// Unbounded Queue is a queue that has no fixed capacity limit, allowing elements to be added indefinitely until system memory is exhausted.

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueUnboundedQueueExample {
    static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();

        // Adding elements
        queue.put(10);
        queue.put(20);
        queue.put(30);

        System.out.println("Unbounded Queue: " + queue);
    }
}

// Output
//Unbounded Queue: [10, 20, 30]