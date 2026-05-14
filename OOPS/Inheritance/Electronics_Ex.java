package OOPS.Inheritance;

import java.util.Scanner;

class Product {
    private String productName;
    private int price;

    Product(String productname,int price){
        setName(productname);
        setPrice(price);
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.productName=name;
        }else{
            this.productName="Invalid";
        }
    }

    public String getName(){
        return productName;
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

    public int discount(int percent){
         int discount=getPrice()*percent/100;
        return discount;
    }

    public void displayProduct(){
        System.out.println("Name : "+getName());
        System.out.println("Price : "+getPrice());
    }
}

class Electronics extends Product{
    private int warrenty;
    private String brand;

    Electronics(String productname,int price,int warrenty, String brand){
        super(productname, price);
        setWarrenty(warrenty);
        setBrand(brand);
    }

    public void setWarrenty(int warrenty){
        if (warrenty>0) {
            this.warrenty=warrenty;
        }else{
            this.warrenty=0;
        }
    }

    public int getWarrenty(){
        return warrenty;
    }

    public void setBrand(String brand){
        if (brand!=null && !brand.isEmpty()) {
            this.brand=brand;
        }else{
            this.brand="Unknown";
        }
    }

    public String getBrand(){
        return brand;
    }

    public int finalPrice(int percent){
        return getPrice()-discount(percent);
    }
    public void displaybrand(){
        displayProduct();
        System.out.println("Warrenty : "+getWarrenty());
        System.out.println("Brand : "+getBrand());
    }
}
public class Electronics_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int price=sc.nextInt();
        int warrenty=sc.nextInt();
        sc.nextLine();
        String brand=sc.nextLine();

        Electronics elec=new Electronics(name, price, warrenty, brand);
        System.out.println(elec.finalPrice(10));
        elec.displaybrand();
        sc.close();
    }
}
