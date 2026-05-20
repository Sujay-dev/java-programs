package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class RideFare {
    abstract int calculateFare(int distance);
    abstract String getRideType();

     public static boolean isValid(int distance){
        return distance>0;
    }
}

class Scooty extends RideFare {
    @Override
    public int calculateFare(int distance){
        return distance*5;
    }

    @Override
    public String getRideType(){
        return "Bike";
    }
}

class Auto extends RideFare {
    public static final int baseCharge=20;

    @Override
    public int calculateFare(int distance){
        return (distance*10)+baseCharge;
    }   

    @Override
    public String getRideType(){
        return "Auto";
    }
}

class Cab extends RideFare {
    public static final int baseCharge=50;
    
    @Override
    public int calculateFare(int distance){
        int fare = (distance * 15) + baseCharge;
        return fare + (fare * 5 / 100);
    }

    @Override
    public String getRideType(){
        return "Cab";
    }
}
public class Ride_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int distance=sc.nextInt();

        if (!RideFare.isValid(distance)) {
            System.out.println("Invalid distance");
            sc.close();
            return;
        }

        RideFare r[]=new RideFare[3];
        r[0]=new Scooty();
        r[1]=new Auto();
        r[2]=new Cab();

        for(int i=0; i<r.length; i++){
            System.out.println(r[i].getRideType()+" : "+r[i].calculateFare(distance));
        }
        sc.close();
    }
}
