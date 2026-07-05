package Revision;

import java.util.Comparator;
import java.util.TreeSet;

class Store{
    private int id;
    private String name;
    private int price;

    Store(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    } 
}
public class StoreEx {
    public static void main(String[] args) {
        TreeSet<Store> set=new TreeSet<>(Comparator.comparing(Store :: getPrice).thenComparing(Store :: getName).thenComparing(Store :: getID));

        set.add(new Store(101, "Soap", 150));
        set.add(new Store(102, "Oil", 450));
        set.add(new Store(103, "ToothPaste", 250));
        set.add(new Store(104, "ToothBrush", 50));
        set.add(new Store(105, "Sugar", 250));

        for (Store s : set) {
            System.out.println(s.getID() + " " + s.getName() + " " +s.getPrice());
        }
    }
}
