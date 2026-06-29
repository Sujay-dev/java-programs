package Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Ticket {
    private int id;
    private String customer;

    Ticket(int id,String customer){
        this.id=id;
        this.customer=customer;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return customer;
    }
}
public class SupportTicket {
    public static void main(String[] args) {
        Queue<Ticket> queue=new LinkedList<>();

        Ticket t1=new Ticket(101, "Sujay");
        Ticket t2=new Ticket(102, "Suyash");
        Ticket t3=new Ticket(103, "Rohan");
        Ticket t4=new Ticket(104, "Vedant");
        Ticket t5=new Ticket(105, "Kunal");

        queue.offer(t1);
        queue.offer(t2);
        queue.offer(t3);
        queue.offer(t4);
        queue.offer(t5);

        for (Ticket t : queue) {
            System.out.println(t.getID() + " -> " + t.getName());
        }

        Ticket serverd=queue.poll();

        System.out.println("Serverd one ticket: " + serverd.getID() + " -> " + serverd.getName());
        Ticket nexTicket=queue.peek();
        System.out.println("Next Ticket: " + nexTicket.getID() + " -> " + nexTicket.getName());
    }
}
