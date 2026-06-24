package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Order{
    private String orderId;
    private String customer;
    private int amount;
    private int items;

    Order(String orderId,String customer,int amount,int items){
        this.orderId=orderId;
        this.customer=customer;
        this.amount=amount;
        this.items=items;
    }
    public String getOrderId(){
        return orderId;
    }
    public String getCustomer(){
        return customer;
    }
    public int getAmount(){
        return amount;
    }
    public int getItems(){
        return items;
    }
}
public class ECommerceOrders {
    public static void main(String[] args) {
        List<Order>list=new ArrayList<>();

        Order o1=new Order("ORD1234321", "Sujay Kamble", 550, 3);
        Order o2=new Order("ORD9878903", "Suyash Desai", 450, 1);
        Order o3=new Order("ORD0009871", "Rohan Jagtap", 500, 2);
        Order o4=new Order("ORD6543700", "Vedant Kanase", 1100, 4);
        Order o5=new Order("ORD2301200", "Athrava Hubale", 1200, 5);

        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);

        list.sort(Comparator.comparing(Order :: getAmount,Comparator.reverseOrder()).thenComparing(Order :: getItems,Comparator.reverseOrder()).thenComparing(Order :: getCustomer).thenComparing(Order :: getOrderId));
    
        for(int i=0; i<list.size(); i++){
            System.out.println("Name: " + list.get(i).getCustomer() + " Items: " + list.get(i).getItems() + " Amount:" + list.get(i).getAmount() + " Order ID: " + list.get(i).getOrderId());
        }
    }
}
