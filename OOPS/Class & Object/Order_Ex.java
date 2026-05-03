package OOPS.Class_Object;

import java.util.Scanner;

class Order {
    private String productname;
    private int price;
    private int quantity;

    Order(){
        this("unknown",0,1);
    }

    Order(String name){
        this(name,0,1);
    }

    Order(String name, int price, int quantity){
        setName(name);
        setValues(price, quantity);
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.productname=name;
        }else{
            this.productname="Unknown";
        }
    }

    public void setValues(int price, int quantity){
        if (price>=0 && quantity>0) {
            this.price=price;
            this.quantity=quantity;
        }else{
            this.price=0;
            this.quantity=1;
        }
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

    public void increasequantity(int amount){
        if (amount>0) {
            quantity+=amount;
        }else{
            amount=0;
        }
    }

    public void display(){
        System.out.println("Product : "+ productname + " " + "Price : "+ price + " " + "Quantity : "+ quantity + " "+ "Total : "+ total());
    }
}

public class Order_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Product name : ");
        String productname=sc.nextLine();
        System.out.println("Enter Price : ");
        int price=sc.nextInt();
        System.out.println("Enter quantity : ");
        int quantity=sc.nextInt();

        Order o0=new Order();
        o0.display();

        Order o1=new Order(productname);
        o1.display();
        System.out.println(o1.total());
        System.out.println(o1.discount(10));
        System.out.println(o1.discount(10, 5));
        o1.display();

        Order o2=new Order(productname,price,quantity);
        o2.display();
        System.out.println(o2.total());
        System.out.println(o2.discount(10));
        System.out.println(o2.discount(10, 5));
        o2.increasequantity(5);
        o2.display();
        sc.close();
    }
}
