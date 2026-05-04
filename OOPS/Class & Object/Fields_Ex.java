package OOPS.Class_Object;

import java.util.Scanner;

class Books {
    private String title;
    private int price;

    Books(){
        this("Unknown",0);
    }

    Books(String title){
        this(title,0);
    }

    Books(String title, int price){
        setTitle(title);
        setPrice(price);
    }

    public void setTitle(String title){
        if (title != null && !title.isEmpty()) {
            this.title=title;
        }
        else{
            this.title="Unknown";
        }
    }

    public void setPrice(int price){
        if (price>=0) {
            this.price=price;
        }else{
            this.price=0;
        }
    }

    public int discount(int percent){
        return price-(price*percent/100);
    }

    public int discount(int percent, int extra){
    int newprice = discount(percent);
    return newprice - (newprice * extra / 100);
    }

    public void display(){
        System.out.println("Title : "+ title +" "+ "Price : " + price);
    }
}

public class Fields_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Title : ");
        String title=sc.nextLine();
        System.out.println("Enter Price : ");
        int price=sc.nextInt();

        Books f0=new Books();
        f0.display();

        Books f1=new Books(title);
        f1.display();
        System.out.println(f1.discount(10));
        System.out.println(f1.discount(10, 5));
        f1.display();

        Books f2=new Books(title,price);
        f2.display();
        System.out.println(f2.discount(10));
        System.out.println(f2.discount(10, 5));
        f2.display();
        sc.close();
    }
}