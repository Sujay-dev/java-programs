package OOPS;

import java.util.Scanner;

class Book {
    String title;
    int price;

    void display(){
        System.out.println("Book Title : "+ title+" ,"+ "Price : "+ price);
    }

    void applydiscount(int percentage){ 
        int discount=price*percentage/100;
        price-=discount;
        if (price<=0) price=0;
    }

    void afterdiscount(){
        System.out.println("Book Title : "+ title+" ,"+"Price after discount : "+ price);
    }
}

public class Book_Info {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Book b1=new Book();
        System.out.println("Enter Book title : ");
        b1.title=sc.nextLine();
        System.out.println("Enter Book price : ");
        b1.price=sc.nextInt();
        System.out.println("Enter dicount percentage");
        int percentage=sc.nextInt();

        b1.display();
        b1.applydiscount(percentage);
        b1.afterdiscount();

        sc.close();

    }  
}
