package Exeption_Handling;

import java.util.Scanner;

class InvalidUserException extends Exception{
    InvalidUserException(String msg){
        super(msg);
    }
}

class InvalidAmountException extends Exception{
    InvalidAmountException(String msg){
        super(msg);
    }
}

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}

class Transaction{
    private String username;
    private int balance;

    Transaction(String username, int balance) throws InvalidUserException,InvalidAmountException{
        setUser(username);
        setBalance(balance);
    }
    public void setUser(String username) throws InvalidUserException{
        if (username==null || username.isEmpty()) {
            throw new InvalidUserException("Invalid Username");
        }
        this.username=username;
    }

    public String getUser(){
        return username;
    }
    public void setBalance(int balance) throws InvalidAmountException {
        if (balance<0) {
            throw new InvalidAmountException("Invalid Balance Amount");
        }
        this.balance=balance;
    }

    public int deposit(int amount) throws InvalidAmountException {
        if (amount<=0) {
            throw new InvalidAmountException("Invalid Deposit");
        }
        balance+=amount;
        return balance;
    }

    public int withdraw(int amount) throws InvalidAmountException,InsufficientBalanceException {
        if (amount<=0) {
            throw new InvalidAmountException("Invalid Withdraw");
        }

        if (amount>balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance-=amount;
        return balance;
    }

    public int getBalance(){
        return balance;
    }
}
public class TransactionSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        try {
            System.out.println("Enter Username: ");
            String username=sc.nextLine();
            System.out.println("Enter Balance: ");
            int balance=sc.nextInt();

            Transaction t=new Transaction(username, balance);

            System.out.println("Name: " + t.getUser());
            System.out.println("Balance: " + t.getBalance());

            sc.nextLine();
            System.out.println("Enter Transaction Type: ");
            String type=sc.nextLine().trim();

            if (type.equalsIgnoreCase("Deposit")) {
                System.out.println("Enter Deposit Amount: ");
                int depositAmount=sc.nextInt();
                System.out.println("Final Balance: " + t.deposit(depositAmount));
            }
            else if (type.equalsIgnoreCase("Withdraw")) {
                System.out.println("Enter Withdraw Amount");
                int withdrawAmount=sc.nextInt();
                System.out.println("Final Balance: " + t.withdraw(withdrawAmount));
            }

            else{
                System.out.println("Invalid Type");
            }
        }
        catch(InvalidUserException | InvalidAmountException | InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
