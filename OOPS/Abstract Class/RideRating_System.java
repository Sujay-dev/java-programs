package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Ride {
    public boolean isvalid(int distance,int time){
        return distance>0 && time>0;
    }
    abstract double calculateRating(int distance, int time);
    abstract String getRideType();
}

class BikeRide extends Ride {
    @Override
    public String getRideType(){
        return "Bike";
    }    

    @Override
    public double calculateRating(int distance, int time){
        if (!isvalid(distance,time)) {
            return 0;
        }
        return (double)(distance/time);
    }
}

class AutoRide extends Ride {
    
    @Override
    public String getRideType(){
        return "Auto";
    }    

    @Override
    public double calculateRating(int distance, int time){
         if (!isvalid(distance,time)) {
            return 0;
        }
        return (double)(distance/time)+1;
    }
}

class CabRide extends Ride {
    @Override
    public String getRideType(){
        return "Cab";
    }

    @Override
    public double calculateRating(int distance, int time){
         if (!isvalid(distance,time)) {
            return 0;
        }
        return (double)(distance/time)+2;
    }
}
public class RideRating_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int distance=sc.nextInt();
        int time=sc.nextInt();

        Ride r[]=new Ride[3];
        r[0]=new BikeRide();
        r[1]=new AutoRide();
        r[2]=new CabRide();

        for(int i=0; i<r.length; i++){
            System.out.println(r[i].getRideType() + " Rating: " + r[i].calculateRating(distance, time));
        }
        sc.close();
    }
}
