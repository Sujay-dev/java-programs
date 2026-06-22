package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Job implements Comparable<Job>{
    private String jobId;
    private int cpuUsage;
    private int memoryUsage;
    private String name;

    Job(String jobId,int cpuUsage,int memoryUsage,String name){
        this.jobId=jobId;
        this.cpuUsage=cpuUsage;
        this.memoryUsage=memoryUsage;
        this.name=name;
    }

    public String getJobId(){
        return jobId;
    }
    public int getCpuUsage(){
        return cpuUsage;
    }
    public int getMemoryUsage(){
        return memoryUsage;
    }
    public String getName(){
        return name;
    }

   @Override
    public int compareTo(Job j){
        if(this.cpuUsage!=j.cpuUsage) return Integer.compare(j.cpuUsage, this.cpuUsage);

        if(this.memoryUsage!=j.memoryUsage) return Integer.compare(j.memoryUsage, this.memoryUsage);

        if(!this.name.equals(j.name)) return this.name.compareTo(j.name);

        return this.jobId.compareTo(j.jobId);
    }
}
public class JobSystem {
    public static void main(String[] args) {
        List<Job> list=new ArrayList<>();

        Job j1=new Job("Job A", 90, 4, "Sujay Kamble");
        Job j2=new Job("Job B", 80, 8, "Vedant Kanase");
        Job j3=new Job("Job C", 93, 12, "Rohan Jagtap");
        Job j4=new Job("Job D", 88, 16, "Suyash Desai");

        list.add(j1);
        list.add(j2);
        list.add(j3);
        list.add(j4);

        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getJobId() + " " + list.get(i).getCpuUsage() + "% " + list.get(i).getMemoryUsage() + "GB " + list.get(i).getName());
        }
    }
}
