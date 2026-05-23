package OOPS.Interface;

import java.util.Scanner;

interface Fuel  {
    String fuelType();    
}

abstract class Vehicle implements Fuel {
    abstract int getSpeed();
    abstract String getType();
}

class Car extends Vehicle  {
    public int getSpeed(){
        return 120;
    }    

    public String getType(){
        return "Car";
    }

    public String fuelType(){
        return "Petrol";
    }
}

class Bike extends Vehicle  {
    public int getSpeed(){
        return 80;
    }    

    public String getType(){
        return "Bike";
    }

    public String fuelType(){
        return "Petrol";
    }  
}

class Truck extends Vehicle {
    public int getSpeed(){
        return 60;
    }    

    public String getType(){
        return "Truck";
    }

    public String fuelType(){
        return "Diesel";
    }    
}
public class Vehicle_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Vehicle v[]=new Vehicle[3];
        v[0]=new Car();
        v[1]=new Bike();
        v[2]=new Truck();

        for(int i=0; i<v.length; i++){
        System.out.println(v[i].getType() + " - Speed: " + v[i].getSpeed() + " - Fuel: " + v[i].fuelType());
        }
        sc.close();
    }
}
