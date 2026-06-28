package Sets.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Product {
    private String name;
    private int price;

    Product(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        TreeSet<Product> set=new TreeSet<>(Comparator.comparing(Product :: getPrice).thenComparing(Product :: getName));

        Product p1=new Product("Oil", 650);
        Product p2=new Product("Soap", 450);
        Product p3=new Product("ToothPaste", 150);
        Product p4=new Product("Perfume", 750);
        Product p5=new Product("Powder", 150);
        Product p6=new Product("Vegetabels", 350);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);

        Iterator<Product> it=set.iterator();
        while (it.hasNext()) {
            Product p=it.next();
            System.out.println(p.getName() + " -> " + p.getPrice());
        }
    }
}
