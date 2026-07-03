package Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

class Task{
    private int id;
    private String task;
    private boolean urgent;

    Task(int id,String task,boolean urgent){
        this.id=id;
        this.task=task;
        this.urgent=urgent;
    }
    public int getId(){
        return id;
    }
    public String getTask(){
        return task;
    }
    public boolean getUrgentorNot(){
        return urgent;
    }
}
public class TaskScheduler {
    public static void main(String[] args) {
        Deque<Task> tasks=new ArrayDeque<>();

        tasks.offerFirst(new Task(1, "Send Email", true));
        tasks.offerLast(new Task(2, "Gym", false));
        tasks.offerFirst(new Task(3, "Backup DB", true));
        tasks.offerLast(new Task(4, "BreakFast", false));
        tasks.offerFirst(new Task(5, "Restart Server", true));
        tasks.offerLast(new Task(6, "Buy Grocery", false));

        System.out.println("Task To Execute: ");
        for (Task t : tasks) {
            System.out.println(" - " + t.getId() + " " + t.getTask() + " Urgent: " + t.getUrgentorNot());
        }

        System.out.println("\nProcessing Tasks: ");
        while (!tasks.isEmpty()) {
            Task process=tasks.pollFirst();
            System.out.println(" - "+process.getId() + " " + process.getTask());
        }
    }
}
