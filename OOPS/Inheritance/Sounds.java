package OOPS.Inheritance;

import java.util.Scanner;

class Pets {
    public void sound(){
        System.out.println("Animal makes sound.");
    }    
}

class Tiger extends Pets{
    @Override
    public void sound(){
        System.out.println("Tiger makes louder sound.");
    }    
}

class Lion extends Pets{
    @Override
    public void sound(){
        System.out.println("Lion makes louder sound than tiger.");
    }    
}
public class Sounds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Tiger tiger=new Tiger();
        tiger.sound();

        Lion lion=new Lion();
        lion.sound();
        sc.close();
    }
}
