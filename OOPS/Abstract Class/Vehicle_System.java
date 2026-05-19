package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Vehicle {
    abstract String getName();
    abstract String fuelType();

    public void start(){
        System.out.println(getName() + " starts - " + fuelType());
    }
}

class Car extends Vehicle {

    @Override
    public String getName(){
        return "Car";
    }
    @Override
    public String fuelType(){
        return "Petrol";
    }
}

class Bike extends Vehicle {

    @Override
    public String getName(){
        return "Bike";
    }

    @Override 
    public String fuelType(){
        return "Petrol";
    }
}

class Truck extends Vehicle {

    @Override
    public String getName(){
        return "Truck";
    }

    @Override
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
            v[i].start();
        }
        sc.close();
    }
}
