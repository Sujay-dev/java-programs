package OOPS.Polymorphism;

import java.util.Scanner;

class Product {
    private String name;
    private int price;
    
    Product(String name, int price){
        setName(name);
        setPrice(price);
    }
    public void setName(String name){
        if (name!=null &&!name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public String getName(){
        return name;
    }

    public void setPrice(int price){
        if (price>0) {
            this.price=price;
        }else{
            this.price=0;
        }
    }

    public int getPrice(){
        return price;
    }

    public void display(){
        System.out.println("Name : "+getName());
        System.out.println("Original Price : "+getPrice());
    }

    public int finalPrice(){
        return price;
    }
}

class RegularProduct extends Product {
    
    RegularProduct(String name, int price){
        super(name, price);
    }

    @Override
    public int finalPrice(){
        int discount=getPrice()*5/100;
        return getPrice()-discount;
    }
}

class PremiumProduct extends Product {
    
    PremiumProduct(String name, int price){
        super(name, price);
    }

    @Override
    public int finalPrice(){
        int discount=getPrice()*15/100;
        return getPrice()-discount;
    }
}

class ClearanceItem extends Product {
    
    ClearanceItem(String name,int price){
        super(name, price);
    }

    @Override
   public int finalPrice(){
        int discount=getPrice()*30/100;
        return getPrice()-discount;
    }
}
public class Discount_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int price=sc.nextInt();

        Product p[]=new Product[3];
        p[0]=new RegularProduct(name, price);
        p[1]=new PremiumProduct(name, price);
        p[2]=new ClearanceItem(name, price);

        for(int i=0; i<p.length; i++){
           p[i].display();
           System.out.println("Final price : "+p[i].finalPrice());
           System.out.println();
        }

        sc.close();
    }
}
