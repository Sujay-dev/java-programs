<<<<<<< HEAD
package OOPS.Interface;

import java.util.Scanner;

interface Payment {
    public int pay(int amount);    
}

interface Security {
    public boolean authenticate(String password);    
}

class SecurePayment implements Payment,Security {
    public boolean authenticate(String password){
        return password.equals("1234");
    }
        public int pay(int amount){
            return (amount+(amount*3)/100);
        }

}
public class Payment_Gateway {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String password=sc.nextLine();
        int amount=sc.nextInt();

        SecurePayment s=new SecurePayment();

         if(s.authenticate(password)){
            System.out.println("Payment Success ");
          System.out.println("Paid: " + s.pay(amount));
          }else{
          System.out.println("Payment failed Wrong password ");
          }
        sc.close();
    }
}
=======
package OOPS.Interface;

import java.util.Scanner;

interface Payment {
    public int pay(int amount);    
}

interface Security {
    public boolean authenticate(String password);    
}

class SecurePayment implements Payment,Security {
    public boolean authenticate(String password){
        return password.equals("1234");
    }
        public int pay(int amount){
            return (amount+(amount*3)/100);
        }

}
public class Payment_Gateway {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String password=sc.nextLine();
        int amount=sc.nextInt();

        SecurePayment s=new SecurePayment();

         if(s.authenticate(password)){
            System.out.println("Payment Success ");
          System.out.println("Paid: " + s.pay(amount));
          }else{
          System.out.println("Payment failed Wrong password ");
          }
        sc.close();
    }
}
>>>>>>> a86436e2a880c3a8aa8349cb1b244a86f0bf53b3
