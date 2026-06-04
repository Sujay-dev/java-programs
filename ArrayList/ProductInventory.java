package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

class Product{
    private int id;
    private String name;
    private int price;

    Product(int id, String name, int price){
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
public class ProductInventory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Product> products=new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 for Add product");
            System.out.println("Enter 2 for view products");
            System.out.println("Enter 3 for searching product");
            System.out.println("Enter 4 for update price");
            System.out.println("Enter 5 for delete product");
            System.out.println("Enter 6 for view most expensive product");
            System.out.println("Enter 7 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                   System.out.println("Enter Name:");
                   String name = sc.nextLine();

                   System.out.println("Enter Price: ");
                   int price=sc.nextInt();

                   boolean exists = false;

                   for(Product p: products){
                   if(p.getId() == id){
                   exists = true;
                   break;
                   }
                  }

                if(exists){
                System.out.println("ID Already Exists");
                 }else{
                products.add(new Product(id,name,price));
                System.out.println("Product Added");
                 }

                 System.out.println();

                    break;
            
                case 2:
                    for(Product p: products){
                        System.out.println("ID: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter id for searching");
                    int searchId=sc.nextInt();
                    boolean found=false;

                    for (Product p : products) {
                        if (p.getId() == searchId) {
                            System.out.println("Found: " + " ID: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
                            found=true;
                        }
                    }

                    if (!found) {
                        System.out.println("Not Found");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Enter id for updating price");
                    int updateId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter New Price");
                    int newPrice=sc.nextInt();
                    boolean update=false;

                    for (Product p : products) {
                        if (p.getId()==updateId) {
                            p.setPrice(newPrice);
                            update=true;
                        }
                    }

                    if (update) {
                        System.out.println("Updated");
                    }else{
                        System.out.println("Not Updated");
                    }

                    for(Product p: products){
                        System.out.println("ID: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
                    }

                    System.out.println();
                    break;

                case 5:
                    System.out.println("Enter id for delete");
                    int deleteId=sc.nextInt();
                    boolean delete=false;

                    for(int i=0; i<products.size(); i++){
                        if (products.get(i).getId() == deleteId) {
                            products.remove(i);
                            delete=true;
                        }
                    }

                    if (delete) {
                        System.out.println("Deleted");
                    }else{
                        System.out.println("Not Deleted");
                    }

                    for(Product p: products){
                        System.out.println("ID: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
                    }

                    System.out.println();

                    break;

                case 6:
                    if (products.isEmpty()) {
                        System.out.println("No products avlaible");
                        break;
                    }

                    Product highPrice=products.get(0);

                    for (Product p : products) {
                        if (p.getPrice() > highPrice.getPrice()) {
                            highPrice=p;
                        }
                    }

                    System.out.println("Most Expensive Product is: ");
                    System.out.println("ID : " + highPrice.getId());
                    System.out.println("Name: " + highPrice.getName());
                    System.out.println("Price: " + highPrice.getPrice());
                    
                    System.out.println();

                    break;

                case 7:
                    System.out.println("Exited !");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
