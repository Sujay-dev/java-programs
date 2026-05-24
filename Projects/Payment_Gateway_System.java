package Projects;

import java.util.Scanner;

interface Payment {
    int pay(int amount);
    String getType();    
    default String generateTransactionID(){
    int id = (int)(Math.random()*100000);
    return "TXN" + id;
}
}


class UPI implements Payment {

    public int pay(int amount){
      return (amount);
    }

    public String getType(){
        return "UPI";
    }
}

class CardPayment implements Payment {
 
    public int pay(int amount){
            return  (amount + (amount*2)/100);
        }

    public String getType(){
        return "Card";
    }
}

class Wallet implements Payment {

    public int pay(int amount){
        if (amount>1000) {
            int finalamt=(amount - (amount*5)/100);
            return finalamt;
        }

        return amount ;
    }

    public String getType(){
        return "Wallet";
    }
}
public class Payment_Gateway_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Payment Type (UPI / Card / Wallet)");
        String paymentType=sc.nextLine();
        System.out.println("Enter Amount : ");
        int amount=sc.nextInt();
        if(amount <= 0){
         System.out.println("Invalid amount");
         sc.close();
        return;
        }

        Payment p;

        if(paymentType.equalsIgnoreCase("UPI")){
          p = new UPI();
          }
        else if(paymentType.equalsIgnoreCase("Card")){
          p = new CardPayment();
          }
        else if(paymentType.equalsIgnoreCase("Wallet")){
          p = new Wallet();
          }
        else{
        System.out.println("Invalid Type");
        sc.close();
        return;
        }

       System.out.println(p.getType() + " Payment: " + p.pay(amount) + " | " + p.generateTransactionID());
        sc.close();
    }
}
