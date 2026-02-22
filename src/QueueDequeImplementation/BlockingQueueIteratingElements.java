package QueueDequeImplementation;
// We can use an iterator to traverse the queue.

import java.util.Iterator;
import java.util.concurrent.*;

public class BlockingQueueIteratingElements {

    static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();

        queue.add(166);
        queue.add(246);
        queue.add(66);
        queue.add(292);
        queue.add(98);

        Iterator<Integer> iterator = queue.iterator();

        System.out.println("BlockingQueue elements:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
// Output
//BlockingQueue elements:
//166 246 66 292 98
