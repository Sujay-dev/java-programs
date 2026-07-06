package Revision_2;

import java.util.TreeMap;

class Book{
    private String isbn;
    private String title;
    private int quantity;
    private int price;

    Book(String isbn,String title,int quantity,int price){
        this.isbn=isbn;
        this.title=title;
        this.quantity=quantity;
        this.price=price;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getPrice(){
        return price;
    }
}
public class BookStore {
    public static void main(String[] args) {
        TreeMap<String,Book> map=new TreeMap<>();

        Book b1=new Book("book2344323", "King is BORN", 10, 500);
        Book b2=new Book("bookgfd4543", "Faith", 15, 400);
        Book b3=new Book("book3454333", "Compromise", 30, 650);
        Book b4=new Book("book8765455", "Efficient", 18, 700);
        Book b5=new Book("book7654344", "Say NO !", 40, 200);

        map.put(b1.getTitle(), b1);
        map.put(b2.getTitle(), b2);
        map.put(b3.getTitle(), b3);
        map.put(b4.getTitle(), b4);
        map.put(b5.getTitle(), b5);

        int sum=0;
        int min=Integer.MAX_VALUE;
        String name="";
        int quntity=-1;
        String isbn="";
        for (var s : map.values()) {
            if (s.getQuantity()>10) {
                System.out.println(s.getIsbn() + " " + s.getTitle() + " " + s.getQuantity() + " " +s.getPrice());
            }
            sum+=s.getPrice()*s.getQuantity();
            if (s.getPrice()<min) {
                min=s.getPrice();
                name=s.getTitle();
                quntity=s.getQuantity();
                isbn=s.getIsbn();
            }
        }
        System.out.println("\nTotal Inventory Value: " +sum);
        System.out.println("Cheapest Product: " + isbn + " " + name + " " + quntity + " " + min);

        System.out.println();
        for (var s : map.entrySet()) {
            System.out.println( s.getKey() + " " + s.getValue().getIsbn() + " " + s.getValue().getQuantity() + " " +s.getValue().getPrice());
        }
    }
}
