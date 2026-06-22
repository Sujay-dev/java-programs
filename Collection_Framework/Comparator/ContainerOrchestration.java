package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Container{
    private String containerId;
    private int cpuUsage;
    private int memoryUsage;
    private int restartCount;

    Container( String containerId,int cpuUsage,int memoryUsage,int restartCount){
        this.containerId=containerId;
        this.cpuUsage=cpuUsage;
        this.memoryUsage=memoryUsage;
        this.restartCount=restartCount;
    }
    public String getContainerId(){
        return containerId;
    }
    public int getCpu(){
        return cpuUsage;
    }
    public int getMemory(){
        return memoryUsage;
    }
    public int getRestartCount(){
        return restartCount;
    }
}
public class ContainerOrchestration {
    public static void main(String[] args) {
        List<Container> list=new ArrayList<>();
        
        Container c1=new Container("CON23rfujj", 89, 8, 3);
        Container c2=new Container("CON43rjfhj", 90, 4, 3);
        Container c3=new Container("CONoiwedjj", 80, 12, 3);
        Container c4=new Container("CON54rfjfn", 79, 16, 3);
        Container c5=new Container("CON5rfjnfn", 80, 8, 3);

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        list.sort(Comparator.comparing(Container :: getRestartCount).thenComparing(Container :: getCpu).thenComparing(Container :: getMemory));

        for(int i=0; i<list.size(); i++){
            System.out.println("Container ID: " + list.get(i).getContainerId() + " CPU Usage: " + list.get(i).getCpu() + " Memory Usage: " + list.get(i).getMemory() + " RestartCount: " + list.get(i).getRestartCount());
        }
    }
}
