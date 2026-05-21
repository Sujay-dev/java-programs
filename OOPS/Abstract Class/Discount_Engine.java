package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class DiscountTypes {
    abstract String applyDiscount(int price);
}

class Festival extends DiscountTypes {
    @Override
    public String applyDiscount(int price){
        int discount=(price*10)/100;
        int finalamt=price-discount;

        return "Festival: "+ finalamt + "(Saved "+ discount + ")";
    }    
}

class MemberDicount extends DiscountTypes {
    @Override
    public String applyDiscount(int price){
        int discount=(price*20)/100;
        int finalamt=price-discount;

        return "Member: "+ finalamt + "(Saved "+ discount + ")";
    }    
}

class NoDiscount extends DiscountTypes {
    @Override
    public String applyDiscount(int price){
        return "No Dicount: "+ price + "(Saved 0)";
    }    
}
public class Discount_Engine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int price=sc.nextInt();

        if(price <= 0){
        System.out.println("Invalid price");
        sc.close();
        return;
        }

        DiscountTypes d[]=new DiscountTypes[3];
        d[0]=new Festival();
        d[1]=new MemberDicount();
        d[2]=new NoDiscount();

        for(int i=0; i<d.length; i++){
            System.out.println(d[i].applyDiscount(price));
        }
        sc.close();
    }
}
