package QueueDequeImplementation;
// To add an element in a priority queue, we can use the add() method.

import java.util.*;

public class PriorityQueueAddingElements {
    static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < 3; i++) {
            pq.add(i);
            pq.add(1);
        }

        System.out.println(pq);
    }
}
// Output
//[0, 1, 1, 1, 2, 1]
