package Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayofElements {
        public static void main(String[] args) {
        Deque<String[]> dq = new ArrayDeque<>();

        String[] emergency={"Send Email","Backup DB"};
        String[] ordinary={"Gym","Breakfast"};

       dq.offerFirst(emergency);
       dq.offerLast(ordinary);

       System.out.println("Tasks: " );
       for (String[] tasks : dq) {
        for (String s : tasks) {
            System.out.println(s);
        }
       }

       System.out.println();
       System.out.println("Urgent Tasks: ");
       String[] Urgent=dq.pollFirst();
       for (String s : Urgent) {
        System.out.println(s);
       }

       System.out.println();
       System.out.println("Noraml Tasks: ");
       String[] Normal=dq.pollLast();
       for (String s : Normal) {
        System.out.println(s);
       }

       System.out.println("All Tasks Completed !");
       System.out.println("Remaining Tasks: " + dq.size());
    }
}
