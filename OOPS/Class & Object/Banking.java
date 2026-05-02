package OOPS;

import java.util.Scanner;

class Ambani {
    String name;
    int balance;

    Ambani(){
        name="Sujay";
        balance=1000;
    }

    void display(){
        System.out.println("Name : "+ name+" ,"+ "Balnace : "+balance);
    }
}

public class Banking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ambani am1=new Ambani();
        am1.display();
        sc.close();
    }
}
