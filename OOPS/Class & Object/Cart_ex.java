package OOPS.Class_Object;

import java.util.Scanner;

class Cartitem {
    private String name;
    private int price; 
    private int quantity;

    Cartitem(){
        this("Unknown",0,1);
    }

    Cartitem(String name){
        this(name,0,1);
    }

    Cartitem(String name, int price, int quantity){
        setName(name);
        setValues(price, quantity);
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public void setValues(int price, int quantity){
        this.price=(price>=0) ? price:0;
        this.quantity=(quantity>0) ? quantity:1;
    }

    public int total(){
        return price*quantity;
    }

    public int discount(int percent){
        return total()-(total()*percent/100);
    }

    public int discount(int percent, int extra){
        int newprice=discount(percent);
        return newprice-(newprice*extra/100);
    }

    public void updateprice(int amount){
        if (amount>0) {
            this.price=amount;
        }
    }

    public void increasequantity(int amount){
        if (amount>0) {
            this.quantity=amount;
        }
    }

    public void display(){
        System.out.println("Name : "+ name + " " + "Price : "+ price + " "+ "Quantity : "+ quantity + " "+ "Total : "+ total());
    }
}

public class Cart_ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Item name : ");
        String name=sc.nextLine();
        System.out.println("Enter Price : ");
        int price=sc.nextInt();
        System.out.println("Enter quantity : ");
        int quantity=sc.nextInt();

        Cartitem c0=new Cartitem();
        c0.display();

        Cartitem C1=new Cartitem(name);
        C1.display();
        System.out.println(C1.total());
        System.out.println(C1.discount(10));
        System.out.println(C1.discount(10, 5));
        C1.display();

        Cartitem C2=new Cartitem(name,price,quantity);
        C2.display();
        System.out.println(C2.total());
        System.out.println(C2.discount(10));
        System.out.println(C2.discount(10, 5));
        C2.updateprice(2000);
        C2.increasequantity(5);
        C2.display();


        sc.close();
    }
}
