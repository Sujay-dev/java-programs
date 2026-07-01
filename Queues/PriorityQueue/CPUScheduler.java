package Queues.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Process {
    private int processId;
    private String processName;
    private int priority;

    Process(int id,String name,int priority){
        this.processId=id;
        this.processName=name;
        this.priority=priority;
    }
    public int getId(){
        return processId;
    }
    public String getName(){
        return processName;
    }
    public int getPriority(){
        return priority;
    }
}
public class CPUScheduler {
    public static void main(String[] args) {
        PriorityQueue<Process> pq=new PriorityQueue<>(Comparator.comparing(Process :: getPriority).thenComparing(Comparator.comparingInt(Process :: getId)).thenComparing(Process :: getName));

        pq.offer(new Process(1, "Chrome", 3));
        pq.offer(new Process(2, "VS Code", 1));
        pq.offer(new Process(3, "Spotify", 5));
        pq.offer(new Process(4, "Discord", 2));
        pq.offer(new Process(5, "Docker", 4));

        while (!pq.isEmpty()) {
            Process process=pq.poll();
            System.out.println("Executing " + process.getName() + " priority " + process.getPriority() + " ID- " + process.getId() );
        }
    }
}
