package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Process implements Comparable<Process>{
    private String processId;
    private int priority;
    private int cpuUsage;

    Process(String processId,int priority,int cpuUsage){
        this.processId=processId;
        this.priority=priority;
        this.cpuUsage=cpuUsage;
    }
    public String getProcessId(){
        return processId;
    }
    public int getPriority(){
        return priority;
    }
    public int getCpuUsage(){
        return cpuUsage;
    }

    @Override
    public int compareTo(Process p){
        if(this.priority!=p.priority)
            return Integer.compare(p.priority, this.priority);
        if(this.cpuUsage!=p.cpuUsage)
            return Integer.compare(p.cpuUsage, this.cpuUsage);
        return this.processId.compareTo(p.processId);
    }
}
public class ProcessScheduler {
    public static void main(String[] args) {
        List<Process> list=new ArrayList<>();

        Process p1=new Process("PRO8ujhujh", 4, 90);
        Process p2=new Process("PRO3ertgdf", 2, 80);
        Process p3=new Process("PRO54erfgf", 5, 70);
        Process p4=new Process("PRO1wefgdf", 1, 95);
        Process p5=new Process("PRO6trfgfg", 3, 87);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getProcessId() + " " + list.get(i).getPriority() + " " + list.get(i).getCpuUsage());
        }
    }
}
