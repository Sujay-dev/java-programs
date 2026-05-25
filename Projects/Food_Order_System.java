package Projects;

import java.util.Scanner;

interface Login{
    boolean validateLogin(String username, String password);
    String getType();
}

interface Discount{
    int applyDiscount(int amount);
}

abstract class Order {
    public abstract int calculateBill(int amount);
    public abstract String getType();
}

interface Payment{
    int pay(int amount);
    String getType();
    default String generateTransactionID(){
    int id = (int)(Math.random()*100000);
    return "TXN" + id;
}
}

class UserLogin implements Login{
    public boolean validateLogin(String username, String password){
        if(username.equals("User") && password.length()>5){
            return true;
        }
        return false;
    }

    public String getType(){
        return "User";
    }
}

class AdminLogin implements Login{
    public boolean validateLogin(String username, String password){
        if(username.equals("Admin") && password.equals("Admin@123")){
            return true;
        }
        return false;
    }

    public String getType(){
        return "Admin";
    }
}

class GuestLogin implements Login{
    public boolean validateLogin(String username, String pasword){
        if(username.equalsIgnoreCase("Guest") && pasword!=null){
            return true;
        }
        return false;
    }

    public String getType(){
        return "Guest";
    }
}

class NormalOrder extends Order{
    public int calculateBill(int amount){
        return amount;
    }

    public String getType(){
        return "Normal";
    }
}

class FastOrder extends Order{
    public static final int deliveryCharge=50;

    public int calculateBill(int amount){
        return (amount + deliveryCharge);
    }

    public String getType(){
        return "Fast";
    }
}

class PremiumOrder extends Order{
    public int calculateBill(int amount){
        int discount=(amount*10)/100;
        return (amount - discount);
    }

    public String getType(){
        return "Premium";
    }
}

class Festival implements Discount {
    public int applyDiscount(int amount){
        int discount=(amount*10)/100;
        int finalamt= amount - discount;
        return finalamt;
    }
}

class Member implements Discount{
    public int applyDiscount(int amount){
        int discount=(amount*20)/100;
        int finalamt= amount - discount;
        return finalamt;
    }
}

class DailyOrder implements Discount{
    public int applyDiscount(int amount){
        return amount;
    }
}

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
        int charge=(amount*2)/100;
        return (amount+charge);
    }

    public String getType(){
        return "Card";
    }
}

class Wallet implements Payment{
    public int pay(int amount){
    if(amount > 1000){
        int cashback=(amount*5)/100;
        int finalamt= amount - cashback;
        return finalamt;
    }

    return amount;
    }

    public String getType(){
        return "Wallet";
    }

}

class LoginFactory{

    public static Login getLogin(String type){

        if(type.equalsIgnoreCase("User")){
            return new UserLogin();
        }
        else if(type.equalsIgnoreCase("Admin")){
            return new AdminLogin();
        }
        else if(type.equalsIgnoreCase("Guest")){
            return new GuestLogin();
        }
        
        return null;
    }
}

class OrderFactory{
    
    public static Order getOrder(String type){

        if(type.equalsIgnoreCase("Normal")){
            return new NormalOrder();
        }
        else if(type.equalsIgnoreCase("Fast")){
            return new FastOrder();
        }
        else if(type.equalsIgnoreCase("Premium")){
            return new PremiumOrder();
        }
        
        return null;
    }
}
    
class DiscountFactory{

    public static Discount getDiscount(String type){

        if (type.equalsIgnoreCase("Festival")) {
            return new Festival();
        }
        else if(type.equalsIgnoreCase("Member")){
            return new Member();
        }
        else if(type.equalsIgnoreCase("DailyOrder")){
            return new DailyOrder();
        }

        return null;
    }
}

class PaymentFactory{

    public static Payment getPayment(String type){

        if(type.equalsIgnoreCase("UPI")){
            return new UPI();
        }
        else if(type.equalsIgnoreCase("Card")){
            return new Card();
        }
        else if(type.equalsIgnoreCase("Wallet")){
            return new Wallet();
        }

        return null;
    }
}
public class Food_Order_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Login Type(Admin / User / Guest): ");
        String loginType=sc.nextLine();

        if (loginType==null || loginType.isEmpty()) {
            System.out.println("Invalid credentials");
            sc.close();
            return;
        }
        
        Login login=LoginFactory.getLogin(loginType);

        if(login==null){
            System.out.println("Invalid Login Type!");
            sc.close();
            return;
        }

        System.out.println("Enter Username: ");
        String username=sc.next();

        System.out.println("Enter Password: ");
        String password=sc.next();

        if(login.validateLogin(username, password)){
            System.out.println("Login: " + login.getType() + " Login Successful");
        }
        else{
            System.out.println("Invalid Credentials!");
            sc.close();
            return;
        }

        System.out.println();

        System.out.println("Enter order type(Normal / Fast / Premium): ");
        String orderType=sc.next();

        if (orderType==null || orderType.isEmpty()) {
            System.out.println("Invalid Order Type!");
            sc.close();
            return;
        }

        System.out.println("Enter Amount: ");
        int amount=sc.nextInt();

        if (amount<=0) {
            System.out.println("Invalid Amount!");
            sc.close();
            return;
        }

        Order order=OrderFactory.getOrder(orderType);

         if(order==null){
            System.out.println("Invalid Order Type!");
            sc.close();
            return;
        }

        int bill=order.calculateBill(amount);
        System.out.println("Order Applied: " + bill);

        System.out.println();

        System.out.println("Enter Dicount Type (Festival / Member / DailyOrder): ");
        String discountType=sc.next();

        if (discountType==null || discountType.isEmpty()) {
            System.out.println("Invalid Discount Type");
            sc.close();
            return;
        }

        Discount discount=DiscountFactory.getDiscount(discountType);

        if(discount==null){
            System.out.println("Invalid Discount Type");
            sc.close();
            return;
        }
        
        int finalamt=discount.applyDiscount(bill);

        System.out.println("After Dicount: " + finalamt);

        System.out.println();

        System.out.println("Enter Payment Type (UPI / Card / Wallet): ");
        String paymentType=sc.next();

        if (paymentType==null || paymentType.isEmpty()) {
            System.out.println("Invalid Payment Type");
            sc.close();
            return;
        }

        Payment payment=PaymentFactory.getPayment(paymentType);

        if(payment==null){
            System.out.println("Invalid Payment Type");
            sc.close();
            return;
        }

        System.out.println("Final Payment: " + payment.pay(finalamt));

        System.out.println();

        System.out.println("Transaction ID: " + payment.generateTransactionID());

        sc.close();
    }
}
