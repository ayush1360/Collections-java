package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        // create a queue
        Queue<Integer> queue = new LinkedList<>();

        // add elements using offer()
        queue.offer(12);
        queue.offer(13);
        queue.offer(30);

        System.out.println(queue);

        //remove element inserted first
        System.out.println(queue.poll());

        System.out.println(queue);

        //check which element is next to be removed
        System.out.println(queue.peek());

    }
}
