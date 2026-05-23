package OOPS.Interface;

import java.util.Scanner;

interface Appliance {
    String turnOn();
    String turnOff();
    String status();
}

class WashingMachine implements Appliance {
     public String turnOn(){
        return "Washing Machine On";
    }    

     public String turnOff(){
        return "Washing Machine Off";
     }

     @Override
     public String status(){
        return "Washing in Progress";
     }
}

class Refrigerator implements Appliance {
    public String turnOn(){
        return "Refrigerator On";
    }    

    public String turnOff(){
        return "Refrigerator Off";
    }

    @Override
    public String status(){
        return "Cooling in Progress";
    }
}
public class Smart_Appliance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Appliance a[]=new Appliance[2];
        a[0]=new WashingMachine();
        a[1]=new Refrigerator();

        for(int i=0; i<a.length; i++){
            System.out.println(a[i].turnOn());
            System.out.println(a[i].turnOff());
            System.out.println(a[i].status());
            System.out.println();
        }
        sc.close();
    }
}
