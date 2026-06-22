package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ApiRequest{
    private String endpoint;
    private int responseTime;
    private int statusCode;
    private int requestCount;

    ApiRequest(String endpoint,int responseTime,int statusCode,int requestCount){
        this.endpoint=endpoint;
        this.responseTime=responseTime;
        this.statusCode=statusCode;
        this.requestCount=requestCount;
    }
    public String getEndPoint(){
        return endpoint;
    }
    public int getResponeTime(){
        return responseTime;
    }
    public int getStatusCode(){
        return statusCode;
    }
    public int getRequestCount(){
        return requestCount;
    }
}
public class ApiSystem {
    public static void main(String[] args) {
        List<ApiRequest>list =new ArrayList<>();

        ApiRequest a1=new ApiRequest("/Products", 200, 203, 15);
        ApiRequest a2=new ApiRequest("/{id}", 100, 302, 4);
        ApiRequest a3=new ApiRequest("/LoginPage", 400, 559, 40);

        list.add(a1);
        list.add(a2);
        list.add(a3);

        list.sort(Comparator.comparing(ApiRequest :: getRequestCount,Comparator.reverseOrder()).thenComparing(ApiRequest :: getResponeTime).thenComparing(ApiRequest :: getStatusCode).thenComparing(ApiRequest :: getEndPoint));

        for(int i=0; i<list.size(); i++){
            System.out.println("End Point: " + list.get(i).getEndPoint() + " Response Time: " + list.get(i).getResponeTime() + "ms  Status Code: " + list.get(i).getStatusCode() + " Request Count: " + list.get(i).getRequestCount());
        }
    }
}
