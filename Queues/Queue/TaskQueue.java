package Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Task {
    private int taskId;
    private String taskName;
    private int executionTime;

    Task(int taskId,String taskName,int executionTime){
        this.taskId=taskId;
        this.taskName=taskName;
        this.executionTime=executionTime;
    }
    public int getID(){
        return taskId;
    }
    public String getName(){
        return taskName;
    }
    public int getExecutionTime(){
        return executionTime;
    }
}
public class TaskQueue {
    public static void main(String[] args) {
        Queue<Task> queue=new LinkedList<>();

        Task t1=new Task(1, "Send Email", 2);
        Task t2=new Task(2, "Generate PDF", 4);
        Task t3=new Task(3, "Backup DB", 10);
        Task t4=new Task(4, "Clear Cache", 1);
        Task t5=new Task(5, "Notify User", 2);

        queue.offer(t1);
        queue.offer(t2);
        queue.offer(t3);
        queue.offer(t4);
        queue.offer(t5);

        while (!queue.isEmpty()) {
            Task task=queue.poll();
            System.out.println("Executing Task: " + task.getID() + " : " + task.getName() + " (" + task.getExecutionTime() + " sec)");
            System.out.println("Reamining Tasks: " + queue.size());
        }
        System.out.println("All Task Completed");
    }
}
