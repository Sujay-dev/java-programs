package Revision_2;

import java.util.LinkedList;

class Pages{
    private int number;
    private double accessTime;

    Pages(int number,double accessTime){
        this.number=number;
        this.accessTime=accessTime;
    }
    public int getNumber(){
        return number;
    }
    public double getAccessTime(){
        return accessTime;
    }
}
public class PageReplace {
    public static void main(String[] args) {
        LinkedList<Pages> list=new LinkedList<>();

        Pages p1=new Pages(1, 3.45);
        Pages p2=new Pages(2, 4.56);
        Pages p3=new Pages(3, 6.7);
        Pages p4=new Pages(4, 8.32);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        for (Pages p : list) {
            System.out.println(p.getNumber() + " " +p.getAccessTime());
        }

        Pages p5=new Pages(5, 9.2);
        list.addLast(p5);

        if (list.size()>4) {
            list.removeFirst();
        }
        
        System.out.println();

        for (Pages p : list) {
            System.out.println(p.getNumber() + " " +p.getAccessTime());
        }
    }
}
