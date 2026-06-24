package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product{
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
        List<Product> list=new ArrayList<>();

        Product p1=new Product("Oil", 650);
        Product p2=new Product("Soap", 150);
        Product p3=new Product("Toothpate", 250);
        Product p4=new Product("ToothBrush", 150);
        Product p5=new Product("Vegetables", 350);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        list.sort(Comparator.comparing(Product :: getPrice).thenComparing(Product :: getName));

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getName() + " : " + list.get(i).getPrice());
        }
    }
}
