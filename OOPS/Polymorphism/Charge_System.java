package OOPS.Polymorphism;

import java.util.Scanner;

class Payments {
    private int amount;
    
    Payments(int amount){
        setAmount(amount);
    }
    public void setAmount(int amount){
        if (amount>0) {
            this.amount=amount;
        }else{
            this.amount=0;
        }
    }

    public int getAmount(){
        return amount;
    }

    public int pay(){
        return amount;
    }

   public String getName(){
    return"";
   }
}

class Upipay extends Payments{
    
    Upipay(int amount){
        super(amount);
    }

    @Override
    public int pay(){
        return getAmount();
    }

    public String getName(){
        return "Upi";
    }
}

class CardPay extends Payments {
    
    CardPay(int amount){
        super(amount);
    }

    @Override
    public int pay(){
        int charge=getAmount()*2/100;
        return getAmount()+charge;
    }

     public String getName(){
        return "Credit Card";
    }
}

class DebitCard extends Payments {
    
    DebitCard(int amount){
        super(amount);
    }

    @Override
    public int pay(){
        int charge=getAmount()*1/100;
        return getAmount()+charge;
    }

     public String getName(){
        return "Debit Card";
    }
}
public class Charge_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int amount=sc.nextInt();

        Payments p[]=new Payments[3];
        p[0]=new Upipay(amount);
        p[1]=new CardPay(amount);
        p[2]=new DebitCard(amount);

        for(int i=0; i<p.length; i++){
            System.out.println(p[i].getName()+ ":"+p[i].pay());
        }
        sc.close();
    }
}
