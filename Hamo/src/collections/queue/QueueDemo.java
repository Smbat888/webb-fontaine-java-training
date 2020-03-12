package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Hmayak Atayan on  04, Mar, 2020
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(8);
        queue.add(7);
        queue.add(3);
        queue.add(1);


        System.out.println("queue = " + queue);

        System.out.println("queue  poll = " + queue.poll());

        System.out.println("queue = " + queue);

        System.out.println("queue peak= " + queue.peek());

        System.out.println("queue = " + queue);


    }
}
