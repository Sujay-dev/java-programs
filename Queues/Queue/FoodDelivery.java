package Queues.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Order {
    private int orderId;
    private String customer;
    private String food;

    Order(int orderId,String customer,String food){
        this.orderId=orderId;
        this.customer=customer;
        this.food=food;
    }
    public int getId(){
        return orderId;
    }
    public String getName(){
        return customer;
    }
    public String getFood(){
        return food;
    }
}
public class FoodDelivery {
    public static void main(String[] args) {
        Queue<Order> queue=new LinkedList<>();

        Order o1=new Order(101, "Sujay", "Chocolate Cake");
        Order o2=new Order(102, "Suyash", "Pasta");
        Order o3=new Order(103, "Rohan", "Sandwich");
        Order o4=new Order(104, "Vedant", "Burger");
        Order o5=new Order(105, "Parth", "Pizza");

        queue.offer(o1);
        queue.offer(o2);
        queue.offer(o3);
        queue.offer(o4);
        queue.offer(o5);

        while (!queue.isEmpty()) {
            Order order=queue.poll();
            System.out.println("Order ID: " + order.getId() + " Preparing " + order.getFood() + " for " + order.getName());
        }
    }
}
