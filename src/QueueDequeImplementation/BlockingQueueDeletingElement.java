package QueueDequeImplementation;
// Elements can be deleted from a LinkedBlockingDeque using remove(). Other methods such as take() and poll() can also be used in a way to remove the first and the last elements.

import java.util.concurrent.*;

public class BlockingQueueDeletingElement {

    static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();

        queue.add(75);
        queue.add(86);
        queue.add(13);
        queue.add(44);
        queue.add(10);

        System.out.println("Before removing: " + queue);

        queue.remove(86);
        queue.remove(44);
        queue.remove(1);

        System.out.println("After removing: " + queue);
    }
}
// Output
//Before removing: [75, 86, 13, 44, 10]
//After removing: [75, 13, 10]
