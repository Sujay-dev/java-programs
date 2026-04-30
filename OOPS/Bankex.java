package OOPS;

import java.util.Scanner;

class Account {
    String accountholder;
    int money;

    void deposit(int amount){
        if(amount <= 0){
        System.out.println("Invalid amount");
        return;
       }
        money+=amount;
        System.out.println("Deposited amount is : "+ amount);
        System.out.println("Balance after deposit : "+ money);
    }

    void withdraw(int amount){
        if (amount<=0) {
            System.out.println("Amount must be positive");
            return;
        }
        if (money>=amount) {
            money-=amount;
            System.out.println("Withdrawal Amount is : "+ amount);
        }
        else{
            System.out.println("Insufficient Balance ");
        }
        System.out.println("Balance after withdrawl : "+ money);
    }

    void trasfer(Account other_acc, int amount){
        if (amount<=0) {
            System.out.println("Invalid Amount");
        }
        if (money>=amount) {
        money-=amount;
        other_acc.money+=amount;
        }else{
            System.out.println("Insufficient balance ");
        }
        System.out.println("Transffered : "+ amount);
        System.out.println("My Balance : "+ money);
        System.out.println("Other Balance : "+ other_acc.money);
    }

        void display(){
            System.out.println("Name : "+accountholder + " , "+ "Balance : "+ money);

        }
    }
public class Bankex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account a1=new Account();
        System.out.println("Enter account holder name : ");
        a1.accountholder=sc.nextLine();
        System.out.println("Enter Balance : ");
        a1.money=sc.nextInt();
        sc.nextLine();

        Account a2=new Account();
        System.out.println("Enter other account holder name : ");
        a2.accountholder=sc.nextLine();
        System.out.println("Enter their balance : ");
        a2.money=sc.nextInt();

        a1.deposit(100);
        a1.withdraw(300);
        a1.trasfer(a2, 100);
        a1.display();
        a2.display();
        sc.close();
    }
}
