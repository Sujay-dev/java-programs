package Revision;

import java.util.Comparator;
import java.util.PriorityQueue;

class Video{
    private int id;
    private String name;
    private boolean premium;
    private int sizeMB;
    private double uploadTime;

    Video(int id,String name,boolean premium,int sizeMB,double uploadTime){
        this.id=id;
        this.name=name;
        this.premium=premium;
        this.sizeMB=sizeMB;
        this.uploadTime=uploadTime;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public boolean isPremium(){
        return premium;
    }
    public int getSize(){
        return sizeMB;
    }
    public double getTime(){
        return uploadTime;
    }
}
public class VideoUploadSystem {
    public static void main(String[] args) {
        PriorityQueue<Video> pq=new PriorityQueue<>(Comparator.comparing(Video :: isPremium,Comparator.reverseOrder()).thenComparing(Video :: getSize).thenComparing(Video :: getTime));

        Video v1=new Video(101, "Mr Beast", true, 200, 8.5);
        Video v2=new Video(102, "Mr Bean", true, 230, 18);
        Video v3=new Video(103, "CarryMinati", false, 150, 12.6);
        Video v4=new Video(104, "ACV", false, 340, 60);
        Video v5=new Video(105, "BBkiVines", true, 170, 10.4);
  
        pq.offer(v1);
        pq.offer(v2);
        pq.offer(v3);
        pq.offer(v4);
        pq.offer(v5);

        System.out.println("Upload Order: ");
        for (Video v : pq) {
            System.out.println(v.getID() + " " + v.getName() + " " + v.getSize() + "MB " + v.getTime());
        }
    }
}
