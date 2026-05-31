package Exeption_Handling;

import java.util.Scanner;

class ATM{
    private int balance;

    ATM(int balance){
        setBalance(balance);
    }

    public void setBalance(int balance){
        if (balance>0) {
            this.balance=balance;
        }else{
            this.balance=0;
        }
    }

    public int deposit(int amount){
          if (amount<=0) {
           throw new  ArithmeticException("Invalid Amount");
          }
          balance+=amount;
          return balance;
    }

    public int withdraw(int amount){
        if (amount<=0) {
            throw new ArithmeticException("Invalid Amount");
        }
        if (amount>balance) {
            throw new ArithmeticException("Insufficient Balance");
        }
        balance-=amount;
        return balance;
    }

     public int getBalance(){
        return balance;
    }
}
public class ATMSystem {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);

        int balance=sc.nextInt();
        ATM atm=new ATM(balance);

        while (true) {
            System.out.println("Enter 1 for chech Balance");
            System.out.println("Enter 2 for deposit Amount");
            System.out.println("Enter 3 for withdraw amount");
            System.out.println("Enter 4 for EXIT! ");

            int choice=sc.nextInt();

            switch (choice) {
                case 1: 
                    System.out.println("Balance: " + atm.getBalance());
                    break;
            
                case 2:
                    int d=sc.nextInt();
                    System.out.println("Balance after deposit: " + atm.deposit(d));
                    break;

                case 3:
                    int w=sc.nextInt();
                    System.out.println("Balance after withdraw: " + atm.withdraw(w));
                    break;
                
                case 4:
                    System.out.println("Exited!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
    }
}