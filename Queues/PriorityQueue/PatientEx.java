package Revision;

import java.util.Comparator;
import java.util.PriorityQueue;

class Patient{
    private int id;
    private String name;
    private int severity;
    private double arrivalTime;

    Patient(int id,String name,int severity,double arrivalTime){
        this.id=id;
        this.name=name;
        this.severity=severity;
        this.arrivalTime=arrivalTime;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int isSeverity(){
        return severity;
    }
    public double getArrivalTime(){
        return arrivalTime;
    }
}
public class PatientEx {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq=new PriorityQueue<>(Comparator.comparing(Patient :: isSeverity).reversed().thenComparing(Comparator.comparing(Patient :: getArrivalTime)).thenComparing(Patient :: getId));

        pq.offer(new Patient(101, "Alice", 4, 10.5));
        pq.offer(new Patient(102, "Bob", 2, 01));
        pq.offer(new Patient(103, "Charlie", 3, 5.50));
        pq.offer(new Patient(104, "Tom", 1, 7.20));
        pq.offer(new Patient(105, "Jerry", 4, 6.23));

        System.out.println("Severity Types: ");
        System.out.println("4 means (Critical)");
        System.out.println("3 means (High)");
        System.out.println("2 means (Medium)");
        System.out.println("1 means (Low)");
        System.out.println();
        System.out.println("Treatment Order: ");
        for (Patient p : pq) {
            System.out.println("ID- " + p.getId() + " Name- " + p.getName() +" Severity- " + p.isSeverity() + " ArrivalTime- " + p.getArrivalTime());
        }
    }
}
