package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Server{
    private String jobId;
    private int priority;
    private int cpu;
    private int memory;
    private String name;

    Server(String jobId,int priority,int cpu,int memory,String name){
        this.jobId=jobId;
        this.priority=priority;
        this.cpu=cpu;
        this.memory=memory;
        this.name=name;
    }
    public String getJobId(){
        return jobId;
    }
    public int getPriority(){
        return priority;
    }
    public int getCpu(){
        return cpu;
    }
    public String getName(){
        return name;
    }
    public int getMemory(){
        return memory;
    }
}
public class ServerJob {
    public static void main(String[] args) {
        List<Server> list=new ArrayList<>();

        Server s1=new Server("Job59",1,90, 4, "Sujay Kamble");
        Server s2=new Server("Job63",2,80, 8, "Vedant Kanase");
        Server s3=new Server("Job026",2,70, 12, "Rohan Jagtap");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        list.sort(Comparator.comparing(Server :: getPriority,Comparator.reverseOrder()).thenComparing(Server :: getCpu,Comparator.reverseOrder()).thenComparing(Server :: getMemory,Comparator.reverseOrder()).thenComparing(Server :: getName).thenComparing(Server :: getJobId));

        for(int i=0; i<list.size(); i++){
            System.out.println("Job ID: " + list.get(i).getJobId() + " Priority: " + list.get(i).getPriority() + " Name: " + list.get(i).getName() + " CPU: " + list.get(i).getCpu() + "%  Memory: " + list.get(i).getMemory() + "GB");
        }
    }
}
