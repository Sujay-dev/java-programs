package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Order implements Comparable<Order>{
    private int orderId;
    private String customerName;
    private int amount;

    Order(int orderId,String customerName,int amount){
        this.orderId=orderId;
        this.customerName=customerName;
        this.amount=amount;
    }
    public int getOrderId(){
        return orderId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public int getAmount(){
        return amount;
    }

    @Override
    public int compareTo(Order o){
        if (this.amount!=o.amount) {
            return Integer.compare(o.amount, this.amount);
        }
        return this.customerName.compareTo(o.customerName);
    }
}
public class OrderSystem {
    public static void main(String[] args) {
        List<Order> list=new ArrayList<>();

        Order o1=new Order(101, "Sujay Kamble", 500);
        Order o2=new Order(102, "Vedant Kanase", 800);
        Order o3=new Order(101, "Rohan Jagtap", 450);
        Order o4=new Order(103, "Suyash Desai", 900);

        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getOrderId() + " " + list.get(i).getCustomerName() + " " + list.get(i).getAmount());
        }
    }
}
