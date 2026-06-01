package Exeption_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class BAccount{
    private int balance;

    BAccount(int balance){
        setBalance(balance);
    }

    public void setBalance(int balance){
        if (balance>0) {
            this.balance=balance;
        }else{
            this.balance=0;
        }
    }

    public int transfer(BAccount toAccount,int amount){
        if (amount<=0) {
            throw new RuntimeException("Invalid Amount");
        }
        if (amount>balance) {
            throw new ArithmeticException("Insufficient Balance");
        }
        this.balance-=amount;
       return toAccount.balance+=amount;
    }

    public int getBalance(){
        return balance;
    }

}
public class BankTransfer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            int balance=sc.nextInt();
            BAccount b1=new BAccount(balance);
            System.out.println("Balance of Account1: " + b1.getBalance());
            int balance2=sc.nextInt();
            BAccount b2=new BAccount(balance2);
            System.out.println("Balance of Account2: " + b2.getBalance());
            int amount=sc.nextInt();
            b1.transfer(b2,amount);
            System.out.println("Account1 Balance: " + b1.getBalance());
            System.out.println("Account2 Balance: " + b2.getBalance());
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
