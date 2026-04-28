package OOPS;

import java.util.Scanner;

class Mobile {
    String brand;
    int battery;
    
    void charge(int percent){
        battery+=percent;
        if (battery>100) {
            battery=100;
        }
        }

    void use(int percent){
        battery-=percent;
        if (battery<0) {
            battery=0;
        }
    }

    void display(){
        System.out.println("Mobile Brand : "+brand + " ,"+"Battery : "+battery);
    }
}

public class Mobile_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Mobile m1=new Mobile();
        System.out.println("Enter brand of mobile : ");
        m1.brand=sc.nextLine();
        System.out.println("Enter battery of mobile : ");
        m1.battery=sc.nextInt();

        m1.charge(50);
        m1.use(20);
        m1.display();

        sc.close();

    }
}
