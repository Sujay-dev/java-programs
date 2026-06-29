package Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Api{
    private int requestId;
    private String endpoint;

    Api(int requestId,String endPoint){
        this.requestId=requestId;
        this.endpoint=endPoint;
    }
    public int getId(){
        return requestId;
    }
    public String getEndPoint(){
        return endpoint;
    }
}
public class ApiRequest {
    public static void main(String[] args) {
        Queue<Api> queue=new LinkedList<>();

        Api a1=new Api(101, "/login");
        Api a2=new Api(102, "/users");
        Api a3=new Api(103, "/orders");
        Api a4=new Api(104, "/paments");
        Api a5=new Api(105, "/logout");

        queue.offer(a1);
        queue.offer(a2);
        queue.offer(a3);
        queue.offer(a4);
        queue.offer(a5);

        while (!queue.isEmpty()) {
            Api request=queue.poll();
            System.out.println("Processing Request: " + request.getId() + " -> " + request.getEndPoint());
        }
    }

}

