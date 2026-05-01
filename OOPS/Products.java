package OOPS;

import java.util.Scanner;

class Product {
    private String name;
    private int price;
    private int quantity;

    Product(String name, int price, int quantity){
        this.name=name;
        setPrice(price);
        setQuantity(quantity);
    }

    public void setPrice(int price){
        if (price>0) 
        this.price=price;
    else price=0;
    }

    public void setQuantity(int quantity){
        if (quantity>0) 
        this.quantity=quantity;
    else quantity=0;
    }

    public int totalcost(){
         return price*quantity;
}

    int applytax(int percent){
        int tax=totalcost()*percent/100;

        return totalcost()+tax;
        } 

    public void display(){
        System.out.println("Name : "+ name+ " ,"+ "Price : "+ price+ " ,"+ "Quantity : "+ quantity);
    }
}

public class Products {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product name : ");
        String name=sc.nextLine();
        System.out.println("Enter price : ");
        int price=sc.nextInt();
        System.out.println("Enter quantity : ");
        int quantity=sc.nextInt();

        Product p1=new Product(name,price,quantity);
        System.out.println("Total cost : "+ p1.totalcost());
        System.out.println("Total cost after applying tax : "+ p1.applytax(18));
        p1.display();
        sc.close();
    }
}
