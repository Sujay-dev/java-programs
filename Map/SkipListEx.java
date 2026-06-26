package Maps.Concurrentmap;

import java.util.concurrent.ConcurrentSkipListMap;

public class SkipListEx {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer,String> map=new ConcurrentSkipListMap<>();

        map.put(30, "Send Email");
        map.put(10, "Generate Report");
        map.put(50, "Backup DB");
        map.put(20, "Process Payment");
        map.put(40, "Clear Cache");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }

        System.out.println();

        System.out.println("Fisrt Scheduled Job: " + map.firstEntry());
        System.out.println("Last Scheduled job: " + map.lastEntry());

        System.out.println();

        System.out.println("First job after 25: " + map.ceilingEntry(25));
        System.out.println();

        System.out.println("First job before 25: " + map.floorEntry(25));
        System.out.println();

        System.out.println("Jobs from 20 onwards: " + map.tailMap(20));
    }
}
