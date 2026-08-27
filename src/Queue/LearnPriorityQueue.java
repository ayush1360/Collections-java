package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        // create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // add elements
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(32);

        System.out.println(pq);

        // the smallest will get removed
        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
