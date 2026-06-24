package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Service {
    private String serviceName;
    private double errorRate;
    private int responseTime;
    private int requestsPerMinute;

    Service(String serviceName,double errorRate,int responseTime,int requestsPerMinute){
        this.serviceName=serviceName;
        this.errorRate=errorRate;
        this.responseTime=responseTime;
        this.requestsPerMinute=requestsPerMinute;
    }
    public String getName(){
        return serviceName;
    }
    public double getRate(){
        return errorRate;
    }
    public int getResponeTime(){
        return responseTime;
    }
    public int getRequestPerMinute(){
        return requestsPerMinute;
    }
}
public class MicroserviceMonitor {
    public static void main(String[] args) {
        List<Service> list=new ArrayList<>();

        Service s1=new Service("BP check", 0.5, 10, 20);
        Service s2=new Service("Operation", 5.5, 5, 10);
        Service s3=new Service("Cancer Treatment", 9.5, 10, 8);
        Service s4=new Service("Skin Checkup", 0.2, 10, 25);
        Service s5=new Service("Dengue", 3.5, 10, 12);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        list.sort(Comparator.comparing(Service :: getRate).thenComparing(Service :: getResponeTime).thenComparing(Comparator.comparingInt(Service :: getRequestPerMinute).reversed()));

        for(int i=0; i<list.size(); i++){
            System.out.println("Service Name: " + list.get(i).getName() + " Error Rate: " + list.get(i).getRate() + " Responce Time: " + list.get(i).getResponeTime() + "min  Request Per min: " + list.get(i).getRequestPerMinute());
        }
    }
}
