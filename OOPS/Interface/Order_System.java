package OOPS;

import java.util.Scanner;

/* ---------------- INTERFACES ---------------- */

interface Login{
    boolean login(String username, String password);
    String getRole();
}

abstract class Order {
    abstract int calculateBill(int amount);
    abstract String getType();
}

interface Discount{
    int applyDiscount(int amount);
}

interface Payment {
    int pay(int amount);
    String getType();    

    default String generateTransactionID(){
        int id = (int)(Math.random()*100000);
        return "TXN" + id;
    }
}

/* ---------------- LOGIN ---------------- */

class UserLogin implements Login {
    public boolean login(String username, String password){
        return username.equalsIgnoreCase("User") && password.length() > 5;
    }

    public String getRole(){
        return "User";
    }
}

class AdminLogin implements Login {
    public boolean login(String username, String password){
        return username.equalsIgnoreCase("Admin") && password.equals("Admin@123");
    }

    public String getRole(){
        return "Admin";
    }
}

class GuestLogin implements Login {
    public boolean login(String username, String password){
        return username.equalsIgnoreCase("Guest");
    }

    public String getRole(){
        return "Guest";
    }
}

/* ---------------- ORDER ---------------- */

class NormalOrder extends Order{
    public int calculateBill(int amount){
        return amount;
    }

    public String getType(){
        return "Normal";
    }
}

class FastOrder extends Order{
    public int calculateBill(int amount){
        return amount + 50;
    }

    public String getType(){
        return "Fast";
    }
}

class PremiumOrder extends Order{
    public int calculateBill(int amount){
        return amount - (amount * 10 / 100);
    }

    public String getType(){
        return "Premium";
    }
}

/* ---------------- DISCOUNT ---------------- */

class Festival implements Discount{
    public int applyDiscount(int amount){
        return amount - (amount * 10 / 100);
    }
}

class Member implements Discount{
    public int applyDiscount(int amount){
        return amount - (amount * 20 / 100);
    }
}

class NoDiscount implements Discount{
    public int applyDiscount(int amount){
        return amount;
    }
}

/* ---------------- PAYMENT ---------------- */

class UPI implements Payment{
    public int pay(int amount){
        return amount;
    }

    public String getType(){
        return "UPI";
    }
}

class Card implements Payment{
    public int pay(int amount){
        return amount + (amount * 2 / 100);
    }

    public String getType(){
        return "Card";
    }
}

class Wallet implements Payment{
    public int pay(int amount){
        if(amount > 1000){
            return amount - (amount * 5 / 100);
        }
        return amount;
    }

    public String getType(){
        return "Wallet";
    }
}

/* ---------------- FACTORIES ---------------- */

class LoginFactory{
    public static Login getLogin(String type){
        if(type.equalsIgnoreCase("User")) return new UserLogin();
        if(type.equalsIgnoreCase("Admin")) return new AdminLogin();
        if(type.equalsIgnoreCase("Guest")) return new GuestLogin();
        return null;
    }
}

class OrderFactory{
    public static Order getOrder(String type){
        if(type.equalsIgnoreCase("Normal")) return new NormalOrder();
        if(type.equalsIgnoreCase("Fast")) return new FastOrder();
        if(type.equalsIgnoreCase("Premium")) return new PremiumOrder();
        return null;
    }
}

class DiscountFactory{
    public static Discount getDiscount(String type){
        if(type.equalsIgnoreCase("Festival")) return new Festival();
        if(type.equalsIgnoreCase("Member")) return new Member();
        return new NoDiscount(); // default
    }
}

class PaymentFactory{
    public static Payment getPayment(String type){
        if(type.equalsIgnoreCase("UPI")) return new UPI();
        if(type.equalsIgnoreCase("Card")) return new Card();
        if(type.equalsIgnoreCase("Wallet")) return new Wallet();
        return null;
    }
}

/* ---------------- SERVICE LAYER ---------------- */

class OrderService {

    public int processOrder(Order order, Discount discount, Login login, int amount){
        int bill = order.calculateBill(amount);

        // Admin gets extra 5% discount
        if(login.getRole().equalsIgnoreCase("Admin")){
            bill = bill - (bill * 5 / 100);
        }

        return discount.applyDiscount(bill);
    }
}

/* ---------------- MAIN ---------------- */

public class Order_System {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Login Type(Admin / User / Guest): ");
        Login login = LoginFactory.getLogin(sc.nextLine());

        System.out.println("Enter Username: ");
        String username = sc.next();

        System.out.println("Enter Password: ");
        String password = sc.next();

        if(login == null || !login.login(username, password)){
            System.out.println("Invalid Credentials");
            sc.close();
            return;
        }

        System.out.println("Login Success: " + login.getRole());

        System.out.println("Enter Order Type(Normal / Fast / Premium): ");
        Order order = OrderFactory.getOrder(sc.next());

        System.out.println("Enter Amount: ");
        int amount = sc.nextInt();

        if(order == null || amount <= 0){
            System.out.println("Invalid Order");
            sc.close();
            return;
        }

        System.out.println("Enter Discount Type(Festival / Member / None): ");
        Discount discount = DiscountFactory.getDiscount(sc.next());

        OrderService service = new OrderService();
        int finalAmount = service.processOrder(order, discount, login, amount);

        System.out.println("Enter Payment Type(UPI / Card / Wallet): ");
        Payment payment = PaymentFactory.getPayment(sc.next());

        if(payment == null){
            System.out.println("Invalid Payment");
            sc.close();
            return;
        }

        int paid = payment.pay(finalAmount);

        System.out.println("\n----- FINAL OUTPUT -----");
        System.out.println("Order: " + order.getType());
        System.out.println("Final Amount: " + paid);
        System.out.println("Payment: " + payment.getType());
        System.out.println("Transaction ID: " + payment.generateTransactionID());

        sc.close();
    }
}