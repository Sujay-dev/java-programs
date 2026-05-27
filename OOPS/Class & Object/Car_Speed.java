package Revision;

import java.util.Scanner;

class Cars{
    private String brand;
    private int speed;

    Cars(String brand, int speed){
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

    public void setSpeed(int speed){
        if (speed>0 && speed<140) {
            this.speed=speed;
        }else{
            this.speed=0;
        }
    }

    public int accelerate(){
        return speed+20;
    }

    public int deaccelerate(){
        return speed-10;
    }

    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}
public class Car_Speed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String brand=sc.nextLine();
        int speed=sc.nextInt();

        Cars cars=new Cars(brand, speed);
        cars.display();
        System.out.println(cars.accelerate());
        System.out.println(cars.deaccelerate());
        sc.close();
    }
}
