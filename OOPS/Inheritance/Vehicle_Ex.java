package OOPS.Inheritance;

import java.util.Scanner;

class Vehicle {
    private String brand;
    private int speed;

    Vehicle(String brand, int speed){
        setBrand(brand);
        setSpeed(speed);
    }

    public void setBrand(String brand){
        if (brand!=null && !brand.isEmpty()) {
            this.brand=brand;
        }else{
            this.brand="Unknown";
        }
    }

    public String getBrand(){
        return brand;
    }

    public void setSpeed(int speed){
        if (speed>0 && speed<=120) {
            this.speed=speed;
        }else{
            this.speed=0;
        }
    }

    public int getSpeed(){
        return speed;
    }

    public void displayVehicle(){
        System.out.println("Brand : "+getBrand());
        System.out.println("Speed : "+getSpeed());
    }
}

class Car extends Vehicle{
    private String fuelType;

    Car(String brand, int speed, String fuelType){
        super(brand, speed);
        setFuelType(fuelType);
    }

    public void setFuelType(String fuletype){
        if (fuletype!=null && !fuletype.isEmpty()) {
            this.fuelType=fuletype;
        }else{
            this.fuelType="Invalid";
        }
    }

    public String getFuelType(){
        return fuelType;
    }

    public void displayCar(){
        displayVehicle();
        System.out.println("Fueltype : "+getFuelType());
    }
}
public class Vehicle_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String brand=sc.nextLine();
        int speed=sc.nextInt();
        sc.nextLine();
        String fuelType=sc.nextLine();

        Car car=new Car(brand, speed, fuelType);
        car.displayCar();
        sc.close();
    }
}
