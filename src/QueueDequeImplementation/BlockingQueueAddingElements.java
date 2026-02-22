package QueueDequeImplementation;
// Elements can be added using add(), put(), or offer() methods.

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingQueueAddingElements {

    static void main(String[] args) {

        BlockingQueue<Integer> bq = new LinkedBlockingDeque<>();
        bq.add(78);
        bq.add(35);
        bq.add(52);
        bq.add(74);

        System.out.println("BlockingQueue: " + bq);
    }
}
// Output
//BlockingQueue: [78, 35, 52, 74]
