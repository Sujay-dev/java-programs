package Maps.WeakHashmap;

import java.util.WeakHashMap;

class Product{
    private String name;

    Product(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        WeakHashMap<Product,Double> map=new WeakHashMap<>();

        Product p1=new Product("SmartPhone");
        Product p2=new Product("EarBuds");
        Product p3=new Product("Laptop");

        map.put(p1, (double) 25000);
        map.put(p2, (double) 5000);
        map.put(p3, (double) 50000);

        System.out.println(map.size());

        p2=null;
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            
        }

        System.out.println(map.size());
    }
}
