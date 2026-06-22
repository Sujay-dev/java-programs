package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node implements Comparable<Node>{
    private String nodeId;
    private double failureRate;
    private int latency;

    Node(String nodeId,double failureRate,int latency){
        this.nodeId=nodeId;
        this.failureRate=failureRate;
        this.latency=latency;
    }
    public String getNodeId(){
        return nodeId;
    }
    public double getFailureRate(){
        return failureRate;
    }
    public int getLatency(){
        return latency;
    }

    @Override
    public int compareTo(Node n){
        if(this.failureRate!=n.failureRate)
            return Double.compare(this.failureRate, n.failureRate);
        if(this.latency!=n.latency)
            return Integer.compare(this.latency, n.latency);
        return this.nodeId.compareTo(n.nodeId);
    }
}
public class NodeSystem {
    public static void main(String[] args) {
        List<Node> list=new ArrayList<>();

        Node n1=new Node("NODE33eefd", 50.0, 100);
        Node n2=new Node("NODE32errf", 30.0, 200);
        Node n3=new Node("NODE9iujnn", 70.0, 150);

        list.add(n1);
        list.add(n2);
        list.add(n3);

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getNodeId() + " " + list.get(i).getFailureRate() + " " + list.get(i).getLatency());
        }
    }
}
