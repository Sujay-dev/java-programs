package OOPS;

import java.util.Scanner;

class Times {
    private int hours;
    private int minutes;
    private int seconds;

    Times(){
        this(0,0,0);
    }

    Times(int hours){
        this(hours,0,0);
    }

     Times(int hours, int mintues, int seconds){
        setValues(hours, mintues, seconds);
        normalize();
    }


   public void setValues(int hours, int minutes, int seconds){
    this.hours = Math.max(0, hours);
    this.minutes = Math.max(0, minutes);
    this.seconds = Math.max(0, seconds);
}

    public void normalize(){
         minutes += seconds / 60;  
    seconds  = seconds % 60; 
    hours   += minutes / 60;  
    minutes  = minutes % 60; 
    }

    public void display(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}

public class Colck_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int minutes=sc.nextInt();
        int seconds=sc.nextInt();

        Times t0=new Times();
        t0.display();

        Times t1=new Times(hours);
        t1.display();

        Times t2=new Times(hours,minutes,seconds);
        t2.display();
        sc.close();
    }
}
