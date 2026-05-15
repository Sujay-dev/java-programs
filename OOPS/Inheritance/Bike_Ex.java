package OOPS.Inheritance;

import java.util.Scanner;

class Vehicles {
    public void start(){
        System.out.println("Vehicle starts.");
    }    
}

class Bike extends Vehicles{
    @Override
    public void start(){
        System.out.println("Bike starts with self.");
    }    
}

class Cars extends Vehicles{
    @Override
    public void start(){
        System.out.println("Car starts with key.");
    }    
}
public class Bike_Ex {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         Bike bike=new Bike();
         bike.start();

         Cars car=new Cars();
         car.start();
         sc.close();
    }
}
