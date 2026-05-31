package Exeption_Handling;

import java.util.Scanner;

class BankBalance{
   private int balance;

   BankBalance(int balance){
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
        throw new ArithmeticException("Invalid Amount");
    }

    balance+=amount;
    return balance;
   }

   public int withdraw(int amount){
    if (amount <= 0) {
    throw new ArithmeticException("Invalid Amount");
      }

    if (amount > balance) {
    throw new ArithmeticException("Insufficient Balance");
      }

     balance-=amount;
     return balance;
   }
}
public class WithdrawEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        BankBalance w=new BankBalance(1000);

    try {
    int depositAmount = sc.nextInt();
    System.out.println("After Deposit: " + w.deposit(depositAmount));

    int withdrawAmount = sc.nextInt();
    System.out.println("After Withdraw: " + w.withdraw(withdrawAmount));

    } catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
    }


        sc.close();
    }
}
