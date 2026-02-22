package QueueDequeImplementation;

// The elements of the LinkedBlockingDeque can be accessed using contains(), element(), peek(), poll().

import java.util.concurrent.*;

public class BlockingQueueAccessingElements {

    static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();

        queue.add(22);
        queue.add(125);
        queue.add(723);
        queue.add(172);
        queue.add(100);

        System.out.println("Queue: " + queue);

        if (queue.contains(22))
            System.out.println("Queue contains 22");

        int head = queue.element();
        System.out.println("Head of queue: " + head);
    }
}
// Output
//Queue: [22, 125, 723, 172, 100]
//Queue contains 22
//Head of queue: 22
