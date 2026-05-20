package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Delivery {
    private String name;

    Delivery(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    abstract int calculateCharge(int weight);
}

class Standard extends Delivery {

    Standard(){
        super("Standard");
    }
    @Override
    public int calculateCharge(int weight){
        if (weight<=0) {
            return 0;
        }

        return (weight*5)+10;
    }    
}

class Express extends Delivery {

    Express(){
        super("Express");
    }
    @Override
    public int calculateCharge(int weight){
        if (weight<=0) {
            return 0;
        }

        return (weight*10)+50;
    }  
}

class Overnight extends Delivery {

    Overnight(){
        super("Overnight");
    }
    @Override
    public int calculateCharge(int weight){
        if (weight<=0) {
            return 0;
        }

        return (weight*20)+70;
    }  
}
public class Delivery_Charges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int weight=sc.nextInt();

        Delivery d[]=new Delivery[3];
        d[0]=new Standard();
        d[1]=new Express();
        d[2]=new Overnight();

        for(int i=0; i<d.length; i++){
            System.out.println(d[i].getName()+" Charges: "+ d[i].calculateCharge(weight) + "Rs for " + weight + " kg");
        }
        sc.close();
    }
}