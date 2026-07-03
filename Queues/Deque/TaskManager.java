package Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

class Tasks{
    private int id;
    private String title;
    private int priority;
    private boolean completed;

    Tasks(int id,String title,int priority,boolean completed){
        this.id=id;
        this.title=title;
        this.priority=priority;
        this.completed=completed;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public int getPriority(){
        return priority;
    }
    public boolean getCompletedorNot(){
        return completed;
    }
}
public class TaskManager {
    public static void main(String[] args) {
        Deque<Tasks> tasks=new ArrayDeque<>();

        tasks.offerFirst(new Tasks(1, "Send Email", 2, false));
        tasks.offerLast(new Tasks(2, "BreakFast", 5, false));
        tasks.offerFirst(new Tasks(3, "Backup DB", 1, false));
        tasks.offerLast(new Tasks(4, "Gym", 4, false));
        tasks.offerFirst(new Tasks(5, "Office", 3, false));

        System.out.println("Pending Tasks: ");
        for (Tasks t : tasks) {
                System.out.println(t.getId() + " " + t.getTitle() + " " + t.getPriority());
        }

        Tasks compeleted1=tasks.pollFirst();
        Tasks completed2=tasks.pollFirst();

        System.out.println("\nCompleted: " + compeleted1.getTitle());
        System.out.println("Completed: " + completed2.getTitle());
        tasks.offerFirst(new Tasks(6, "Restart PC", 1, false));

        System.out.println("\nRemaining Tasks: ");
        for (Tasks t : tasks) {
            System.out.println(t.getId() + " " + t.getTitle() + " " + t.getPriority());
        }
        System.out.println("Remaning Tasks: " + tasks.size());
    }
}
