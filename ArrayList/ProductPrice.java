package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Products{
    private int id;
    private String name;
    private int price;

    Products(int id, String name, int price){
        setID(id);
        setName(name);
        setPrice(price);
    }

    public void setID(int id){
        if (id>0) {
            this.id=id;
        }else{
            this.id=0;
        }
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public String getName(){
        return name;
    }

    public void setPrice(int price){
        if (price>0) {
            this.price=price;
        }else{
            this.price=0;
        }
    }

    public int getPrice(){
        return price;
    }

}
public class ProductPrice {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayList<Products> products=new ArrayList<>();

        for(int i=0; i<5; i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int price=sc.nextInt();

            products.add(new Products(id, name, price));
        }

        for (Products p : products) {
            System.out.println(p.getId() + " - " + p.getName() + " : " + p.getPrice());
        }

        System.out.println();

        Collections.sort(products, (a,b) -> b.getPrice()-a.getPrice());
        
        System.out.println("Expensive-------->Cheapest");
        for (Products p : products) {
            System.out.println(p.getId() + " - " + p.getName() + " : " + p.getPrice());
        }

        System.out.println();

         Collections.sort(products, (a,b) -> a.getPrice()-b.getPrice());
        
         System.out.println("Cheapest-------->Expensive");
        for (Products p : products) {
            System.out.println(p.getId() + " - " + p.getName() + " : " + p.getPrice());
        }
        sc.close();
    }
}
