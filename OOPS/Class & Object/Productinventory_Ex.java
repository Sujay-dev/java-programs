package OOPS.Class_Object;

import java.util.Scanner;

class Inventory {
    private String name;
    private int[] prices;

    Inventory(){
        this("Unknown",new int[5]);
    }

    Inventory(String name){
        this(name,new int[5]);
    }

    Inventory(String name, int[] prices){
        setName(name);
        setPrices(prices);
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public void setPrices(int[] prices){
        if (prices==null) {
            this.prices=new int[1];
            return;
        }

        this.prices=new int[prices.length];

        for(int i = 0; i < prices.length; i++){
        int val = prices[i];

        if (val < 0) val = 0;
        if (val>10000) val=10000;

        this.prices[i] = val;
    }
}

    public int maxPrice(){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            if (prices[i]>max) {
                max=prices[i];
            }
        }
        return max;
    }

    public int minPrice(){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if (prices[i]<min) {
                min=prices[i];
            }
        }
        return min;
    }

    public int sum(){
        int sum=0;
        for(int i=0; i<prices.length; i++){
            sum+=prices[i];
        }
        return sum;
    }

    public double averagePrice(){
        double avg=(double)sum()/prices.length;
        return avg;
    }

    public void displayPrices(){
        System.out.println("Prices : ");
        for(int i=0; i<prices.length; i++){
            System.out.print(prices[i]+" ");
        }
        System.out.println();
    }

    public void display(){
    System.out.println("Name : " + name);
    displayPrices();
    System.out.println("Max : " + maxPrice()+ "  Min : "+ minPrice() + "  Average : "+ averagePrice());
}
}

public class Productinventory_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int size=sc.nextInt();
        int[] prices=new int[size];
        for(int i=0; i<size; i++){
            prices[i]=sc.nextInt();
        }

        Inventory i0=new Inventory();
        i0.display();

        Inventory i1=new Inventory(name);
        i1.display();

        Inventory i2=new Inventory(name,prices);
        i2.displayPrices();
        System.out.println("Max price is : "+ i2.maxPrice());
        System.out.println("Min price is : "+ i2.minPrice());
        System.out.println("Average price is : "+ i2.averagePrice());
        i2.display();
        sc.close();
    }
}
