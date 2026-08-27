package Queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        //create a deque
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // add
        adq.offer(12);

        // add at front
        adq.offerFirst(10);

        //add at last
        adq.offerLast(20);
        adq.offer(23);

        System.out.println(adq);

        System.out.println(adq.peek());

        //element at front
        System.out.println(adq.peekFirst());

        // element at last
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        System.out.println(adq);


    }
}
