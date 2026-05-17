package OOPS.Polymorphism;

import java.util.Scanner;

class Vehicle {
    public void move(){
    }    
}

class Car extends Vehicle {
    @Override
    public void move(){
        System.out.println("Car drives on road");
    }    
}

class Ship extends Vehicle {
    @Override
    public void move(){
        System.out.println("Ship sails on water");
    }    
}

class Plane extends Vehicle {
    @Override
    public void move(){
        System.out.println("Plane flies in SKY");
    }    
}
public class Vehicle_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Vehicle v[]=new Vehicle[3];
        v[0]=new Car();
        v[1]=new Ship();
        v[2]=new Plane();

        for(int i=0; i<v.length; i++){
            v[i].move();
        }
        sc.close();
    }
}
