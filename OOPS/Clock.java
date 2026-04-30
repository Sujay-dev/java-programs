package OOPS;

import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

   void normalize(){
    minutes += seconds / 60;  
    seconds  = seconds % 60; 
    hours   += minutes / 60;  
    minutes  = minutes % 60;  
}

    void display(){
        System.out.println("Hours : "+ hours+" ."+ "Minutes : "+ minutes+ " ."+ "Seconds : "+ seconds);
    }
}

public class Clock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Time t1=new Time();

        t1.hours=1;
        t1.minutes=12;
        t1.seconds=70;

        t1.normalize();
        t1.display();
        sc.close();
    }
}
