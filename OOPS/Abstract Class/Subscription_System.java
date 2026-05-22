package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Subscription {
    abstract int calculateBill(int months);
    abstract String getPlan();
}

class BasicPlan extends Subscription {
    @Override
    public String getPlan(){
        return "Basic Plan";
    }    

    @Override
    public int calculateBill(int months){
        if (months<=0) {
            return 0;
        }
        return 100*months;
    }
}

class StandardPlan extends Subscription {
    @Override
    public String getPlan(){
        return "Standard Plan";
    }    

    public static final int fee=50;
    @Override
    public int calculateBill(int months){
         if (months<=0) {
            return 0;
        }
        return (200*months)+fee;
    }
}

class PremiumPlan extends Subscription {
    @Override
    public String getPlan(){
        return "Premium Plan";
    }    

    public static final int fee=100;
    @Override
    public int calculateBill(int months){
         if (months<=0) {
            return 0;
        }
        int premium= (300*months) + fee ;
        return premium- (premium*10)/100;
    }
}
public class Subscription_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int months=sc.nextInt();

        Subscription s[]=new Subscription[3];
        s[0]=new BasicPlan();
        s[1]=new StandardPlan();
        s[2]=new PremiumPlan();

        for(int i=0; i<s.length; i++){
            System.out.println(s[i].getPlan() + " : " + s[i].calculateBill(months));
        }
        sc.close();
    }
}
