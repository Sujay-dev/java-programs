package Queues.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Task {
    private int id;
    private String taskName;
    private int priority;

    Task(int id,String name,int priority){
        this.id=id;
        this.taskName=name;
        this.priority=priority;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return taskName;
    }
    public int getPriority(){
        return priority;
    }
}
public class TaskScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks=new PriorityQueue<>(Comparator.comparing(Task :: getPriority).thenComparing(Comparator.comparingInt(Task :: getId)).thenComparing(Task :: getName));

        tasks.offer(new Task(1, "Backup DB", 2));
        tasks.offer(new Task(2, "Send Email", 4));
        tasks.offer(new Task(3, "Clear Cache", 3));
        tasks.offer(new Task(4, "Payment Service", 1));
        tasks.offer(new Task(5, "Generate Report", 2));

        while (!tasks.isEmpty()) {
            Task task=tasks.poll();
            System.out.println("Executing " + task.getName() + " ( Priority " + task.getPriority() + " ) ID- " + task.getId());
            System.out.println("Remaining Tasks: " + tasks.size());
        }
        System.out.println();
        System.out.println("All Tasks Completed !");
    }
}
