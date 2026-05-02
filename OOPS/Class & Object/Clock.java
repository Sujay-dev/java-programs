package OOPS;

import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    Time(int hours, int mintues, int seconds){
        setValues(hours, mintues, seconds);
        normalize();
    }

    public void setValues(int hours, int mintues, int seconds){
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
        System.out.println( hours+":"+ minutes+ ":"+ seconds+":");
    }
}

public class Clock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int hours=sc.nextInt();
        int minutes=sc.nextInt();
        int seconds=sc.nextInt();

        Time t1=new Time(hours,minutes,seconds);

        t1.display();
        sc.close();
    }
}
