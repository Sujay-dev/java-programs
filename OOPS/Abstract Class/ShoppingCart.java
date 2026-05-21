package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Tax {
    public boolean isValid(int price){
        return price > 0;
    }
    abstract String applyTax(int price);
}

class Gst extends Tax {
    @Override
    public String applyTax(int price){
        if (!isValid(price)) {
            return "Invalid Price";
        }
        int tax=(price*18)/100;

        return "GST: "+ (price+tax);
    }    
}

class Vat extends Tax {
    @Override
    public String applyTax(int price){
         if (!isValid(price)) {
            return "Invalid Price";
        }
        int tax=(price*10)/100;

        return "VAT: "+ (price+tax);
    }    
}

class NoTax extends Tax {
    @Override
    public String applyTax(int price){
         if (!isValid(price)) {
            return "Invalid Price";
        }
        return "No Tax: "+ price;
    }    
}
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int price=sc.nextInt();

        Tax t[]=new Tax[3];
        t[0]=new Gst();
        t[1]=new Vat();
        t[2]=new NoTax();

        for(int i=0; i<t.length; i++){
            System.out.println(t[i].applyTax(price));
        }
        sc.close();
    }
}
