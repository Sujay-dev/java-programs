package Queues.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HighSalary {
    public static void main(String[] args) {
        PriorityQueue<Integer> salary = new PriorityQueue<>(Comparator.reverseOrder());

        salary.offer(50000);
        salary.offer(40000);
        salary.offer(80000);
        salary.offer(10000);
        salary.offer(30000);

        System.out.println("Highest Salary: " + salary.peek());
        System.out.println("Salaries: " + salary);
        salary.poll();
        salary.poll();
        System.out.println("After removing two Salaries: " + salary);
    }
}
