package Queues.PriorityQueue;

import java.util.PriorityQueue;

public class Patient {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(4);
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);
        pq.offer(2);

        while (!pq.isEmpty()) {
            System.out.println("Treating patient with priority "+ pq.poll());
        }
    }
}
