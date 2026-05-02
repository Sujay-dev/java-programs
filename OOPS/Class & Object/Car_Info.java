package OOPS;

import java.util.Scanner;

class Car {
    String brand;
    int price;
    
    void display(){
        System.out.println("Brand "+ brand + " "+ "Price "+ price);
    }
}

public class Car_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Car c1=new Car();
        Car c2=new Car();
        System.out.println("Enter Car brand name : ");
        c1.brand=sc.nextLine();
        System.out.println("Enter price : ");
        c1.price=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter car brand name : ");
        c2.brand=sc.nextLine();
        System.out.println("Enter price : ");
        c2.price=sc.nextInt();

        c1.display();;
        c2.display();
        sc.close();
    }
}
