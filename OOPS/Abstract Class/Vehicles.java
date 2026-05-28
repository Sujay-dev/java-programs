package Revision;

import java.util.Scanner;

abstract class VehicleTypes {
    protected int speed;
    VehicleTypes(int speed){
        this.speed=speed;
    }
    abstract int getSpeed();
    abstract String getType();
}

class Car extends VehicleTypes{

    Car(int speed){
        super(speed);
    }
    @Override
    public int getSpeed(){
        return speed+20;
    }
    @Override
    public String getType(){
        return "Car";
    }
}

class Bike extends VehicleTypes{

    Bike(int speed){
        super(speed);
    }
    @Override
    public int getSpeed(){
        return speed+10;
    }
    @Override
    public String getType(){
        return "Bike";
    }
}
public class Vehicles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int speed=sc.nextInt();

        VehicleTypes v1=new Car(speed);
        VehicleTypes v2=new Bike(speed);

        System.out.println(v1.getType()+ " Speed: " + v1.getSpeed());
        System.out.println(v2.getType()+ " Speed: " + v2.getSpeed());
        sc.close();
    }
}
