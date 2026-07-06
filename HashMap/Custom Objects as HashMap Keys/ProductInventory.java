package Revision_2;

import java.util.HashMap;

class Product{
    private int id;
    private String name;
    private int quantity;
    private int price;

    Product(int id,String name,int quantity,int price){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
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
    public void setQuantity(int quantity,int newQuantity){
        this.quantity=quantity+newQuantity;
    }
    public int getPrice(){
        return price;
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        HashMap<Integer,Product> map=new HashMap<>();

        Product p1=new Product(1, "Soap", 45, 1360);
        Product p2=new Product(2, "Sugar", 0, 1550);
        Product p3=new Product(3, "Oil", 25, 3700);
        Product p4=new Product(4, "Shampoo", 75, 1000);
        Product p5=new Product(5, "ToothPaste", 0, 1050);

        map.put(p1.getId(), p1);
        map.put(p2.getId(), p2);
        map.put(p3.getId(), p3);
        map.put(p4.getId(), p4);
        map.put(p5.getId(), p5);

        System.out.println("ID 5 Exists- " + map.containsKey(5));

        System.out.println();

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue().getName() + " " + s.getValue().getQuantity() + " " + s.getValue().getPrice());
        }

        map.get(3).setQuantity(map.get(3).getQuantity(), 5);

        int max=Integer.MAX_VALUE;
        int id=-1;
        String name="";
        int quantity=-1;
        System.out.println();
        for (var s : map.entrySet()) {
            if (s.getValue().getPrice()<max) {
                max=s.getValue().getPrice();
                id=s.getKey();
                name=s.getValue().getName();
                quantity=s.getValue().getQuantity();
            }
            System.out.println(s.getKey() + " " + s.getValue().getName() + " " + s.getValue().getQuantity() + " " + s.getValue().getPrice());
        }

        map.values().removeIf((p)-> p.getQuantity()==0);

        System.out.println("\n Removed Product out of Stock: ");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue().getName() + " " + s.getValue().getQuantity() + " " + s.getValue().getPrice());
        }
        int sum=0;

        for (var s : map.values()) {
            sum+=s.getPrice()*s.getQuantity();
        }

        System.out.println("Total Inventory Value: " + sum);
        System.out.println("Cheapest Product: " + id + " " + name + " " + quantity + " " + max );
    }
}
