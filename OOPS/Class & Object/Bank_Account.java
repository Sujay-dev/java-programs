package OOPS.Class_Object;

import java.util.Scanner;

class Bank_Acc {
    private String name;
    private int[] balance;

    Bank_Acc(){
        this("Unknown",new int[5]);
    }

    Bank_Acc(String name){
        this(name,new int[5]);
    }

    Bank_Acc(String name, int []balance){
        setName(name);
        setBalance(balance);
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public void setBalance(int[] balance){
        if (balance.length==0) {
            this.balance=new int[1];
            return;
        }

        this.balance=new int[balance.length];

        for(int i = 0; i < balance.length; i++){
        int val = balance[i];

        if (val < 0) val = 0;
   
        this.balance[i] = val;
    }
    }

    public int totalbalance(){
        int sum=0;
        for(int i=0; i<balance.length; i++){
            sum+=balance[i];
        }
        return sum;
    }

    public int highestbalance(){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<balance.length; i++){
            if (balance[i]>max) {
                max=balance[i];
            }
        }
        return max;
    }

    public void displaybalance(){
        System.out.println("Balance");
        for(int i=0; i<balance.length; i++){
            System.out.print(balance[i]+" ");
        }
        System.out.println();
    }

    public void display(){
    System.out.println("Name : " + name);
    displaybalance();
    System.out.println("Total : " + totalbalance());
    System.out.println("Highest : " + highestbalance());
}
}
public class Bank_Account {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        Bank_Acc b0=new Bank_Acc();
        b0.display();

        Bank_Acc b1=new Bank_Acc(name);
        b1.display();

        Bank_Acc b2=new Bank_Acc(name,arr);
        b2.displaybalance();
        System.out.println("Total Balance : "+b2.totalbalance());
        System.out.println("Highest Balance : "+ b2.highestbalance());
        b2.display();
        sc.close();
    }
}
