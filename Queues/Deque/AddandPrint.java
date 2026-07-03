package Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddandPrint {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.offerLast("Java");
        dq.offerLast("Spring");
        dq.offerFirst("SQL");
        dq.offerFirst("Docker");
        dq.offerLast("Kafka");
        dq.offerFirst("Reddis");

        System.out.println("Deque : " + dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.pollFirst();
        dq.pollLast();
        System.out.println("Remaining: " + dq);
    }
}
