package Maps.Treemap;

import java.util.Comparator;
import java.util.TreeMap;

class Product
{
    private int id;
    private String name;
    private int price;

    Product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getId(){
        return id;
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
         Comparator<Product> priceComparator1=Comparator.comparing(Product :: getPrice);
        TreeMap<Product,String> map=new TreeMap<>(priceComparator1);

        Product p1=new Product(102, "Oil", 450);
        Product p2=new Product(104, "ToothPaste", 150);
        Product p3=new Product(101, "Soap", 250);
        Product p4=new Product(103, "Perfume", 750);

        map.put(p4, "Product");
        map.put(p3, "Product");
        map.put(p1, "Product");
        map.put(p2, "Product");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " " + s.getKey().getName() + " " + s.getKey().getPrice() + " " + s.getValue());
        }
        System.out.println();
        Comparator<Product> priceComparator2=Comparator.comparingInt(Product :: getPrice).reversed();
        TreeMap<Product,String> map2=new TreeMap<>(priceComparator2);

        map2.put(p4, "Product");
        map2.put(p3, "Product");
        map2.put(p1, "Product");
        map2.put(p2, "Product");

         for (var s : map2.entrySet()) {
            System.out.println(s.getKey().getId() + " " + s.getKey().getName() + " " + s.getKey().getPrice() + " " + s.getValue());
        }
        System.out.println();
        Comparator<Product> nameComparator=Comparator.comparing(Product :: getName);
        TreeMap<Product,String> map3=new TreeMap<>(nameComparator);

        map3.put(p4, "Product");
        map3.put(p3, "Product");
        map3.put(p1, "Product");
        map3.put(p2, "Product");

         for (var s : map3.entrySet()) {
            System.out.println(s.getKey().getId() + " " + s.getKey().getName() + " " + s.getKey().getPrice() + " " + s.getValue());
        }
    }
}
