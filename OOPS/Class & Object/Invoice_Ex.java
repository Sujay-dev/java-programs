package OOPS.Class_Object;

import java.util.Scanner;

class Invoice {
    private String itemname;
    private int price;
    private int quantity;

    Invoice(){
        this("Unknown",0,1);
    }

    Invoice(String name){
        this(name,0,1);
    }

    Invoice(String name, int price, int quantity){
        setItemName(name);
        setValues(price, quantity);
    }

    public void setItemName(String name){
        if (name != null && !name.isEmpty()) {
            this.itemname=name;
        }
        else{
            this.itemname="Unknown";
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
        int total=total();
        return total-(total*percent/100);
    }

    public int discount(int percent, int extra){
        int newtotal=discount(percent);
        return newtotal-(newtotal*extra/100);
    }

    public void display(){
        System.out.println("Item Name : "+ itemname + " "+ "Price : "+ price + " "+ "Quantity : "+ quantity + " "+ "Total : "+ total());
    }
}

public class Invoice_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter item name : ");
        String itemname=sc.nextLine();
        System.out.println("Enter price : ");
        int price=sc.nextInt();
        System.out.println("Enter quantity : ");
        int quantity=sc.nextInt();

        Invoice i0=new Invoice();
        i0.display();

        Invoice i1=new Invoice(itemname);
        i1.display();
        System.out.println(i1.total());
        System.out.println(i1.discount(10));
        System.out.println(i1.discount(10, 5));
        i1.display();;

        Invoice i2=new Invoice(itemname,price,quantity);
        i2.display();
        System.out.println(i2.total());
        System.out.println(i2.discount(10));
        System.out.println(i2.discount(10, 5));
        i2.display();
        sc.close();
    }
}
