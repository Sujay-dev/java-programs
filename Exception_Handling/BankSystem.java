package Exeption_Handling;

import java.util.Scanner;

class BankAcc {
    private int balance;

    BankAcc(int balance){
        this.balance = balance;
    }

    public int deposit(int amount){
        if(amount <= 0){
            throw new ArithmeticException("Invalid deposit amount");
        }
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){
        if(amount <= 0){
            throw new ArithmeticException("Invalid withdrawal amount");
        }
        if(amount > balance){
            throw new ArithmeticException("Insufficient balance");
        }
        balance -= amount;
        return balance;
    }

    public int getBalance(){
        return balance;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAcc acc = new BankAcc(1000);

        try{
            System.out.println("Enter deposit amount:");
            int d = sc.nextInt();
            System.out.println("Balance after deposit: " + acc.deposit(d));

            System.out.println("Enter withdrawal amount:");
            int w = sc.nextInt();
            System.out.println("Balance after withdrawal: " + acc.withdraw(w));

        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final Balance: " + acc.getBalance());

        sc.close();
    }
}