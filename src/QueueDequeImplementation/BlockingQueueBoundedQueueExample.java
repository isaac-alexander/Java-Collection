package QueueDequeImplementation;
// Bounded Queue is a queue with a fixed capacity that limits the number of elements it can hold at a time.

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueBoundedQueueExample {

    static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>(3);

        // Adding elements
        queue.put(1);
        queue.put(2);
        queue.put(3);
        // queue.put(4); // This would block until space is available

        System.out.println("Bounded Queue: " + queue);
    }
}
// Output
// Bounded Queue: [1, 2, 3]
