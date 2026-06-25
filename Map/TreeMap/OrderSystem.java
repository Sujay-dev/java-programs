package Maps.Treemap;

import java.util.Comparator;
import java.util.TreeMap;

class Order{
    private String orderId;
    private int price;
    private int quantity;
    private double timestamp;

    Order(String orderId,int price,int quantity,double timestamp){
        this.orderId=orderId;
        this.price=price;
        this.quantity=quantity;
        this.timestamp=timestamp;
        
    }
    public String getId(){
        return orderId;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTimeStamp(){
        return timestamp;
    }
}
public class OrderSystem {
    public static void main(String[] args) {
        Comparator<Order> byOrders=Comparator.comparing(Order :: getPrice).reversed().thenComparing(Comparator.comparing(Order :: getTimeStamp));

        TreeMap<Order,String> map=new TreeMap<>(byOrders);

        map.put(new Order("ORD23edfdd", 540, 4,10.30), "Order");
        map.put(new Order("ORD54edfgr", 150, 1,2.50), "Order");
        map.put(new Order("ORD94jnvjf", 150, 2,12.34), "Order");
        map.put(new Order("ORD12edffg", 1540, 10,1.33), "Order");

        for (var s : map.entrySet()) {
            System.out.println("ID: "+ s.getKey().getId() + " Price: " + s.getKey().getPrice() +  " Quantity: " + s.getKey().getQuantity() + " Time: " + s.getKey().getTimeStamp());
        }
        System.out.println();
        System.out.println("ID: " + map.firstKey().getId() + " Price: " + map.firstKey().getPrice() + " Quantity: " + map.firstKey().getQuantity());

        System.out.println();

        Comparator<Order> sellOrders=Comparator.comparing(Order :: getPrice).thenComparing(Order :: getTimeStamp);

        TreeMap<Order,String> map2=new TreeMap<>(sellOrders);

       map2.put(new Order("ORD23edfdd", 540, 4,10.30), "Order");
       map2.put(new Order("ORD54edfgr", 150, 1,2.50), "Order");
       map2.put(new Order("ORD94jnvjf", 150, 2,12.34), "Order");
       map2.put(new Order("ORD12edffg", 1540, 10,1.33), "Order");

       for (var s : map2.entrySet()) {
            System.out.println("ID: "+ s.getKey().getId() + " Price: " + s.getKey().getPrice() +  " Quantity: " + s.getKey().getQuantity() + " Time: " + s.getKey().getTimeStamp());
        }
        System.out.println();
        System.out.println("ID: " + map2.firstKey().getId() + " Price: " + map2.firstKey().getPrice() + " Quantity: " + map2.firstKey().getQuantity());
        
        System.out.println(map2.pollFirstEntry().getKey().getId());
        for (var s : map2.entrySet()) {
            System.out.println("ID: "+ s.getKey().getId() + " Price: " + s.getKey().getPrice() +  " Quantity: " + s.getKey().getQuantity() + " Time: " + s.getKey().getTimeStamp());
        }
    }
}
