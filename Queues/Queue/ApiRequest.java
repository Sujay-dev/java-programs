package Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ApiRequest {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        queue.offer(101);
        queue.offer(102);
        queue.offer(103);
        queue.offer(104);
        queue.offer(105);

        while (!queue.isEmpty()) {
           Integer request=queue.poll();
           System.out.println("Processing: " + request);
        }
    }

}
