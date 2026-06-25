package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Node{
    private String nodeId;
    private int activeConnections;
    private int latency;
    private double failureRate;
    private int load;

    Node(String nodeId,int activeConnections,int latency,double failureRate,int load){
        this.nodeId=nodeId;
        this.activeConnections=activeConnections;
        this.latency=latency;
        this.failureRate=failureRate;
        this.load=load;
    }
    public String getNodeId(){
        return nodeId;
    }
    public int getActiveConnection(){
        return activeConnections;
    }
    public int getLatency(){
        return latency;
    }
    public double getFailureRate(){
        return failureRate;
    }
    public int getLoad(){
        return load;
    }
}
public class SystemNodes {
    public static void main(String[] args) {
        List<Node> list=new ArrayList<>();

        Node n1=new Node("NODEeujn3", 250, 100, 5.5, 15);
        Node n2=new Node("NODEkeirj", 150, 300, 4.5, 10);
        Node n3=new Node("NODEqwesx", 100, 500, 7.5, 21);

        list.add(n1);
        list.add(n2);
        list.add(n3);

        list.sort(Comparator.comparing(Node :: getFailureRate).thenComparingInt(Node :: getLatency).thenComparingInt(Node :: getLoad).thenComparing(Comparator.comparingInt(Node :: getActiveConnection).reversed()).thenComparing(Node :: getNodeId));

        for(int i=0; i<list.size(); i++){
            System.out.println("Node ID: " + list.get(i).getNodeId() + " Active Connections: "+ list.get(i).getActiveConnection() + " Latency: "+ list.get(i).getLatency() + " Failure Rate: " + list.get(i).getFailureRate() + " Load: " + list.get(i).getLoad());
        }
    }
}
