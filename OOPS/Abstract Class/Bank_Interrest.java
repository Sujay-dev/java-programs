package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Bank {
    abstract int getInterrest(); 
    abstract String getName();   
}

class Sbi extends Bank {

    @Override
    public int getInterrest(){
       return 6;
    }

    @Override
    public String getName(){
        return "SBI";
    }
}

class Hdfc extends Bank {
    
    @Override
    public int getInterrest(){
        return 7;
    }

     @Override
    public String getName(){
        return "HDFC";
    }
}

class Icici extends Bank {

    @Override
    public int getInterrest(){
       return 8;
    }

     @Override
    public String getName(){
        return "ICICI";
    }
}
public class Bank_Interrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Bank b[]=new Bank[3];
        b[0]=new Sbi();
        b[1]=new Hdfc();
        b[2]=new Icici();

        for(int i=0; i<b.length; i++){
            System.out.println(b[i].getName()+":"+b[i].getInterrest()+"%");
        }
        sc.close();
    }
}
