package OOPS;

import java.util.Scanner;

class Product {
    String name;
    int price;
    int quantity;

    int totalcost(){
        if (price<0 || quantity< 0) {
      return 0;
    }else{
         return price*=quantity;
    }
}

    int applytax(int percent){
        int total=totalcost();
        int tax=total*percent/100;

        return total+tax;
        } 

    void display(){
        System.out.println("Name : "+ name+ " ,"+ "Price : "+ price+ " ,"+ "Quantity : "+ quantity);
    }
}

public class Products {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product p1=new Product();
        System.out.println("Enter Product name : ");
        p1.name=sc.nextLine();
        System.out.println("Enter price of it : ");
        p1.price=sc.nextInt();
        System.out.println("Enter quantity of it : ");
        p1.quantity=sc.nextInt();
        p1.display();
        p1.applytax(18);
        p1.display();
        sc.close();
    }
}
