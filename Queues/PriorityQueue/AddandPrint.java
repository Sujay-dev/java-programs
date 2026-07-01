package Queues.PriorityQueue;

import java.util.PriorityQueue;

public class AddandPrint {
     public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(20);
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);

        for (Integer i : pq) {
            System.out.println(i);
        }
        System.out.println("Highest Priority element: " + pq.peek());
        pq.poll();
        pq.poll();
        System.out.println(pq);
    }
}
