package Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerSupport {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();

        queue.offer("Sujay");
        queue.offer("Vedant");
        queue.offer("Rohan");
        queue.offer("Suyash");
        queue.offer("Parth");

        System.out.println("Customers: " + queue);

        System.out.println("Served: "+ queue.poll());

        queue.offer("Kunal");

        System.out.println("Remaining Customers: " + queue);
    }
}
