package Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrder {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();

        queue.offer("Burger");
        queue.offer("Pizza");
        queue.offer("Sandwich");
        queue.offer("Pasta");

        System.out.println("Orders: " + queue);
        String customer1=queue.poll();
        String customer2=queue.poll();

        if (customer1 != null) {
            System.out.println("Served: " + customer1);
        }
        if (customer2 != null) {
            System.out.println("Served: " + customer2);
        }
        System.out.println("Next Customer Order: " + queue.peek());
        System.out.println("Remaining Orders: " + queue);
    }
}
