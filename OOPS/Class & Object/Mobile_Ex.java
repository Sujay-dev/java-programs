package OOPS;

import java.util.Scanner;

class Phone {
    private String brand;
    private int price;

    Phone(){
        this("Nothing",0);
    }

    Phone(String brand){
        this(brand,0);
    }

    Phone(String brand, int price){
        setBrand(brand);
        setPrice(price);
    }

    public void setBrand(String brand){
        if(brand != null && !brand.isEmpty())
            this.brand = brand;
        else
            this.brand = "Unknown";
    }

    public void setPrice(int price){
        if (price>0) {
            this.price=price;
        }else{
            price=0;
        }
    }

    public void display(){
        System.out.println("Brand : "+ brand+ " "+ "Price : "+ price);
    }


}
public class Mobile_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String brand=sc.nextLine();
        int price=sc.nextInt();

        Phone p0=new Phone();
        p0.display();

        Phone p1=new Phone(brand);
        p1.display();

        Phone p2=new Phone(brand,price);
        p2.display();
        sc.close();
    }
}
