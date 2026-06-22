package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product>{
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

    @Override
    public int compareTo(Product p){
        if (this.price==p.price) {
            return this.name.compareTo(p.name);
        }
        return this.price-p.price;
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        ArrayList<Product> list=new ArrayList<>();

        Product p1=new Product(101, "Oil", 650);
        Product p2=new Product(102, "Chees", 450);
        Product p3=new Product(103, "Butter", 450);
       
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getPrice());
        }
    }
}
