package Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class AddandPrint {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();

        queue.offer("Document 1");
        queue.offer("Document 2");
        queue.offer("Document 3");
        queue.offer("Document 4");

        System.out.println(queue);
        System.out.println(queue.peek());
        String document=queue.poll();
        if (document != null) {
            System.out.println(document);
        }
        System.out.println(queue);
    }
}
