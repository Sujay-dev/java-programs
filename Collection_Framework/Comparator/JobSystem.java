package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Job{
    private String jobId;
    private int priority;
    private double estmTime;
    private long credAt;

    Job(String jobId,int priority,double estmTime,long credAt){
        this.jobId=jobId;
        this.priority=priority;
        this.estmTime=estmTime;
        this.credAt=credAt;
    }
    public String getJobId(){
        return jobId;
    }
    public int getpriority(){
        return priority;
    }
    public double getEstmTime(){
        return estmTime;
    }
    public long getCredAt(){
        return credAt;
    }
}
public class JobSystem {
    public static void main(String[] args) {
        List<Job> list=new ArrayList<>();

        Job j1=new Job("Emp59", 2, 9.00, 2026);
        Job j2=new Job("Emp43", 3, 11.00, 2025);
        Job j3=new Job("Emp09", 1, 7.00, 2024);

        list.add(j1);
        list.add(j2);
        list.add(j3);
        
        Comparator<Job> urgentJob=Comparator.comparing(Job :: getpriority).reversed().thenComparing(Job :: getEstmTime).thenComparing(Job :: getCredAt);

        System.out.println("Urgent Job Result");
        List<Job> urgentJobResult=new ArrayList<>(list);

        urgentJobResult.sort(urgentJob);

        for(int i=0; i<urgentJobResult.size(); i++){
            System.out.println(urgentJobResult.get(i).getJobId() + " " + urgentJobResult.get(i).getpriority() + " " + urgentJobResult.get(i).getEstmTime() + " " + urgentJobResult.get(i).getCredAt());
        }

        System.out.println();

        Comparator<Job> fatestJob=Comparator.comparing(Job :: getEstmTime).thenComparing(Comparator.comparing(Job :: getpriority).reversed());

        System.out.println("Fastest Job Result");
         List<Job> fastestJobResult=new ArrayList<>(list);

        fastestJobResult.sort(fatestJob);

        for(int i=0; i<fastestJobResult.size(); i++){
            System.out.println(fastestJobResult.get(i).getJobId() + " " + fastestJobResult.get(i).getpriority() + " " + fastestJobResult.get(i).getEstmTime() + " " + fastestJobResult.get(i).getCredAt());
        }

        System.out.println();

        Comparator<Job> fifoScheduler=Comparator.comparing(Job :: getCredAt);

        System.out.println("Fifo Scheduler Result");
        List<Job> fifoSchedulerResult=new ArrayList<>(list);

        fifoSchedulerResult.sort(fifoScheduler);

        for(int i=0; i<fifoSchedulerResult.size(); i++){
            System.out.println(fifoSchedulerResult.get(i).getJobId() + " " + fifoSchedulerResult.get(i).getpriority() + " " + fifoSchedulerResult.get(i).getEstmTime() + " " + fifoSchedulerResult.get(i).getCredAt());
        }
    }
}
