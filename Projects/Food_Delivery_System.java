package Projects;

import java.util.Scanner;

interface Order {
    int placeOrder(int amount);
    String getType();
    String getDeliveryTime(); 
    String getStatus();  
    default String generateOrderID(){
    int id = (int)(Math.random()*100000);
    return "ORD" + id;
    } 
}

class NormalOrder implements Order {
    public int placeOrder(int amount){
        return amount;
    }    

    public String getType(){
        return "Normal";
    }

    public String getDeliveryTime(){
        return "30 mins";
    }

    public String getStatus(){
        return "Preparing";
    }
}

class FastOrder implements Order {
    public static final int deliveryCharge=50;

    public int placeOrder(int amount){
        return amount + deliveryCharge;
    }    

    public String getType(){
        return "Fast";
    }

    public String getDeliveryTime(){
        return "15 mins";
    }

    public String getStatus(){
        return "On the Way";
    }
}

class PremiumOrder implements Order{
    public int placeOrder(int amount){
        int discount=(amount*10)/100; // 10% discount, free delivery
        int finalamt=amount-discount;
        return finalamt;
    }

    public String getType(){
        return "Premium";
    }

    public String getDeliveryTime(){
        return "10 mins";
    }

    public String getStatus(){
        return "Priority Processing";
    }
}
public class Food_Delivery_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Order Type(Normal / Fast / Premium): ");
        String orderType=sc.nextLine();
        System.out.println("Enter Amount: ");
        int amount=sc.nextInt();
        if (amount<=0) {
            System.out.println("Invalid Order");
            sc.close();
            return;
        }

        Order o;
        if (orderType.equalsIgnoreCase("Normal")) {
            o=new NormalOrder();
        }
        else if (orderType.equalsIgnoreCase("Fast")) {
            o=new FastOrder();
        }
        else if (orderType.equalsIgnoreCase("Premium")) {
            o=new PremiumOrder();
        }
        else{
            System.out.println("Invalid Type");
            sc.close();
            return;
        }

        System.out.println(o.getType() + " Order: " + "$" + o.placeOrder(amount)  + " | " + "ID: " +  o.generateOrderID() + " | Delivery Time: " + o.getDeliveryTime() + " | Status: " + o.getStatus());
        sc.close();
    }
}
