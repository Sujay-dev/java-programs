package Queues.Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class EmptyQueue {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();

        System.out.println(queue.poll());
        System.out.println(queue.peek());
       // queue.remove();
        try {
            System.out.println(queue.element());
        } catch (NoSuchElementException e) {
           System.out.println("Queue is Empty !");
        }
    }
}
