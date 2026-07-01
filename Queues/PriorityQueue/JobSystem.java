package Queues.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Job {
    private int jobId;
    private String name;
    private int priority;
    private int executionTime;

    Job(int id,String name,int priority,int executionTime){
        this.jobId=id;
        this.name=name;
        this.priority=priority;
        this.executionTime=executionTime;
    }
    public int getId(){
        return jobId;
    }
    public String getName(){
        return name;
    }
    public int getPriority(){
        return priority;
    }
    public int getExectionTime(){
        return executionTime;
    }
}
public class JobSystem {
    public static void main(String[] args) {
        PriorityQueue<Job> jobs=new PriorityQueue<>(Comparator.comparingInt(Job :: getPriority).thenComparingInt(Job :: getExectionTime));

        jobs.offer(new Job(1, "Send Email", 2, 5));
        jobs.offer(new Job(2, "Send Payment", 1, 3));
        jobs.offer(new Job(3, "Backup", 2, 2));
        jobs.offer(new Job(4, "Clear Cache", 3, 1));
        jobs.offer(new Job(5, "Send Notification", 1, 6));

        Job first=jobs.peek();
        System.out.println("First Job: ID- " + first.getId() + " Name- " + first.getName() + " Priority- " + first.getPriority() + " ExecutionTime- " + first.getExectionTime());
    
        System.out.println();
        
        while (!jobs.isEmpty()) {
            Job j=jobs.poll();
            System.out.println("ID- " + j.getId() + " Name- "+ j.getName()+ " Priority- "+ j.getPriority() + " ExecutionTime- " + j.getExectionTime());
        }
    }
}
