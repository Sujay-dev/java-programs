package OOPS.Inheritance;

import java.util.Scanner;

class Payment {
    public void processPayment(int amount){
        System.out.println("Processing paymet of : "+amount);
        System.out.println("Payment done !");
    }    
}

class CreditCard extends Payment{
    private String cardNumber;
    private int limit;
    
    CreditCard(String cardNumber,int limit){
        setNumber(cardNumber);
        setLimit(limit);
    }

    public void setNumber(String cardNumber){
        if (cardNumber.length()==16) {
            this.cardNumber=cardNumber;
        }else{
            this.cardNumber="Invalid";
        }
    }

    public void setLimit(int limit){
        if (limit>0 && limit<=10000) {
            this.limit=limit;
        }else{
            this.limit=0;
        }
    }

    @Override
    public void processPayment(int amount){
        super.processPayment(amount);
        System.out.println("Paid via card !");
        System.out.println("Card number : "+cardNumber);
        System.out.println("Limit : "+limit);
    }
}

class Upi extends Payment{
    private String upiId;
    
    Upi(String upiId){
        setId(upiId);
    }

    public void setId(String id){
    if(id!=null && !id.isEmpty() && id.length()<=45){
        this.upiId=id;   
    }else{
        this.upiId="Invalid";
    }
}

    @Override
    public void processPayment(int amount){
        super.processPayment(amount);
        System.out.println("Paid via UPI !");
        System.out.println("UPI ID : "+upiId);
    }
}

class Cash extends Payment{
    private int amtGiven;
    private int actualAmt;
    
    Cash(int amount,int actualamt){
        setAmt(amount,actualamt);

    }

     public void setAmt(int amtGiven, int actualAmt){
        if(amtGiven > 0 && actualAmt > 0 && amtGiven >= actualAmt){
            this.amtGiven  = amtGiven;
            this.actualAmt = actualAmt;
        }else{
            this.amtGiven  = 0;
            this.actualAmt = 0;
            System.out.println("Invalid! Amount given less than bill!");
        }
    }

    @Override
    public void processPayment(int amount){
        super.processPayment(amount);
        System.out.println("Paid via Cash !");
        System.out.println("Amount given : "+amtGiven);
        System.out.println("Change back : "+(amtGiven-actualAmt));
    }
}
public class Payment_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int payment=sc.nextInt();
        sc.nextLine();

        String cardNumber=sc.nextLine();
        int limit=sc.nextInt();
        sc.nextLine();

        String upiId=sc.next();
        int amount=sc.nextInt();
        int actualamt=sc.nextInt();

        System.out.println("--- Credit Card ---");
        CreditCard card = new CreditCard(cardNumber, limit);
        card.processPayment(payment);

        System.out.println();

        System.out.println("--- UPI ---");
        Upi upi = new Upi(upiId);
        upi.processPayment(payment);

        System.out.println();

        System.out.println("--- Cash ---");
        Cash cash = new Cash(amount,actualamt);
        cash.processPayment(payment);
        sc.close();
    }
}
