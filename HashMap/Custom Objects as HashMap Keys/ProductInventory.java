package HashMap;

import java.util.HashMap;
import java.util.Scanner;

class Product{
    private String barcode;     
    private String name;
    private double price;
    private int quantity;

    Product(String barcode,String name,double price,int quantity){
        this.barcode=barcode;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getBarcode(){
        return barcode;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Product)) return false;
        Product other=(Product) obj;
        return this.barcode.equals(other.barcode);
    }

    @Override
    public int hashCode(){
        return this.barcode.hashCode();
    }
}
public class ProductInventory {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Product,String> map=new HashMap<>();

        Product p1=new Product("1234567", "SmartPhone", 25000, 1);
        Product p2=new Product("1234567", "Airbuds", 5000, 1);

        map.put(p1, "Expensive");
        map.put(p2, "Premium");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getBarcode() + " -> " + s.getValue());
        }

        System.out.println(map.size());
        sc.close();
    }
}
