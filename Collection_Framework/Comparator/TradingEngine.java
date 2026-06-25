package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Orders
{
    private String orderId;
    private double price;
    private int quantity;
    private long timestamp;

    Orders(String orderId,double price,int quatity,long timestamp){
        this.orderId=orderId;
        this.price=price;
        this.quantity=quatity;
        this.timestamp=timestamp;
    }
    public String getId(){
        return orderId;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public long getTimeStamp(){
        return timestamp;
    }
}
public class TradingEngine {
    public static void main(String[] args) {
        List<Orders> list=new ArrayList<>();

        Orders o1=new Orders("ORD94utjjf", 2500, 120, 3);
        Orders o2=new Orders("ORD54rggfv", 5050, 220, 6);
        Orders o3=new Orders("ORD23edfff", 3496, 100, 2);

        list.add(o1);
        list.add(o2);
        list.add(o3);

        list.sort(Comparator.comparing(Orders :: getPrice).reversed().thenComparing(Comparator.comparing(Orders :: getQuantity).reversed().thenComparing(Comparator.comparing(Orders :: getTimeStamp))));

        System.out.println("Buy Order Comparator");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getId() + " " + list.get(i).getPrice() + " " + list.get(i).getQuantity() + " " + list.get(i).getTimeStamp());
        }
        
        System.out.println();

        list.sort(Comparator.comparing(Orders :: getPrice).thenComparing(Comparator.comparing(Orders :: getQuantity).reversed()).thenComparing(Comparator.comparing(Orders :: getTimeStamp)));

        System.out.println("Sell Order Comparator");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getId() + " " + list.get(i).getPrice() + " " + list.get(i).getQuantity() + " " + list.get(i).getTimeStamp());
        }
    }
}
