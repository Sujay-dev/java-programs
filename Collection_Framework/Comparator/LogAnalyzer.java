package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Log{
    private String service;
    private int severity;
    private long timestamp;

    Log(String service,int severity, long timestamp){
        this.service=service;
        this.severity=severity;
        this.timestamp=timestamp;
    }
    public String getService(){
        return service;
    }
    public int getSeverity(){
        return severity;
    }
    public long getTimeStamp(){
        return timestamp;
    }
}
public class LogAnalyzer {
    public static void main(String[] args) {
        List<Log> list=new ArrayList<>();

        Log l1=new Log("Grooming", 25, 30);
        Log l2=new Log("Serving", 45, 10);
        Log l3=new Log("Security", 35, 20);

        list.add(l1);
        list.add(l2);
        list.add(l3);

        list.sort(Comparator.comparing(Log :: getSeverity).reversed().thenComparing(Comparator.comparing(Log :: getTimeStamp).reversed()));

        System.out.println("A");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getService() + " " + list.get(i).getSeverity() + " " + list.get(i).getTimeStamp());
        }

        System.out.println();

        list.sort(Comparator.comparing(Log :: getService).thenComparing(Log :: getTimeStamp));

        System.out.println("B");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getService() + " " + list.get(i).getSeverity() + " " + list.get(i).getTimeStamp());
        }

        System.out.println();

        list.sort(Comparator.comparing(Log :: getTimeStamp).reversed());

        System.out.println("C");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getService() + " " + list.get(i).getSeverity() + " " + list.get(i).getTimeStamp());
        }
    }
}
