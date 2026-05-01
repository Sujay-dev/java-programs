package OOPS;

import java.util.Scanner;

class Mobile {
    private String brand;
    private int battery;

    Mobile(String brand,int battery){
        this.brand=brand;
        this.battery=battery;
    }
    
    public void charge(int percent){
        battery+=percent;
        if (battery>=100) {
            battery=100;
        }
        }

   public void use(int percent){
    battery-=percent;
        if (battery<=0) {
            battery=0;
        }
    }

    public int getbattery(){
        return battery;
    }

    void display(){
        System.out.println("Mobile Brand : "+brand + " ,"+"Battery : "+battery);
    }
}

public class Mobile_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String brand=sc.nextLine();
        int battery=sc.nextInt();

        Mobile m1=new Mobile(brand,battery);
        m1.charge(50);
        m1.use(20);
        System.out.println(m1.getbattery());
        m1.display();

        sc.close();

    }
}
