package Maps.Treemap;

import java.util.Comparator;
import java.util.TreeMap;

class Store{
    private int id;
    private String name;
    private int quantity;

    Store(int id,String name,int quantity){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
}
public class OnlineStoreInventory {
    public static void main(String[] args) {
        TreeMap<Store,String> map=new TreeMap<>(Comparator.comparing(Store :: getQuantity).thenComparing(Store :: getId));

        Store s1=new Store(102, "Oil", 25);
        Store s2=new Store(101, "Soap", 5);
        Store s3=new Store(104, "Perfume", 35);
        Store s4=new Store(105, "Hair Oil", 50);
        Store s5=new Store(103, "ToothPaste", 7);

        map.put(s1, "Product");
        map.put(s2, "Product");
        map.put(s3, "Product");
        map.put(s4, "Product");
        map.put(s5, "Product");

        System.out.println("All products: ");
        for (var s : map.entrySet()) {
             System.out.println("ID: " + s.getKey().getId() + " Name: " + s.getKey().getName() + " Quantity: " + s.getKey().getQuantity());
        }
        System.out.println();

        String name="";
        int id=-1;
        int max=Integer.MIN_VALUE;
        System.out.println("Low Stock Products: ");
        for (var s : map.entrySet()) {
            if (s.getKey().getQuantity()<10) {
                System.out.println("ID: " + s.getKey().getId() + " Name: " + s.getKey().getName() + " Quantity: " + s.getKey().getQuantity());
            }
            if (s.getKey().getQuantity()>max) {
                max=s.getKey().getQuantity();
                name=s.getKey().getName();
                id=s.getKey().getId();
            }
        }

        System.out.println();
        System.out.println("Product with highest Stock: " + "ID: " + id + " Name: "+ name + " Stock: " + max);
    }
}
