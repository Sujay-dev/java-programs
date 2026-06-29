package Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

class PrintJob {
    private int jobId;
    private String fileName;

    PrintJob(int jobId,String fileName){
        this.jobId=jobId;
        this.fileName=fileName;
    }
    public int getID(){
        return jobId;
    }
    public String getName(){
        return fileName;
    }
}
public class PrintServer {
    public static void main(String[] args) {
        Queue<PrintJob> queue=new LinkedList<>();

        PrintJob p1=new PrintJob(1, "Resume.pdf");
        PrintJob p2=new PrintJob(2, "Invoice.pdf");
        PrintJob p3=new PrintJob(3, "Notes.pdf");
        PrintJob p4=new PrintJob(4, "Photo.pdf");

        queue.offer(p1);
        queue.offer(p2);
        queue.offer(p3);
        queue.offer(p4);

        System.out.println("Jobs: ");
        for (PrintJob p : queue) {
            System.out.println(p.getID() + " " + p.getName());
        }

        System.out.println();
        PrintJob currentJob=queue.peek();
        System.out.println("Current Job: " + currentJob.getID() + " " + currentJob.getName());

        queue.poll();
        queue.poll();

        System.out.println();
        PrintJob p5=new PrintJob(5, "Report.pdf");
        queue.offer(p5);

        System.out.println("Remaining Jobs: ");
        for (PrintJob p : queue) {
            System.out.println(p.getID() + " " + p.getName());
        }


    }
}
