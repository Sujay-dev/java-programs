package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Book{
    private String isbn;
    private String title;
    private double rating;
    private int price;

    Book(String isbn,String title,double rating,int price){
        setIsbn(isbn);
        this.title=title;
        this.rating=rating;
        this.price=price;
    }
    public void setIsbn(String isbn){
        if (isbn.length()==13) {
            this.isbn=isbn;
        }else{
            this.isbn="Invalid";
        }
    }
    public String getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public double getRating(){
        return rating;
    }
    public int getPrice(){
        return price;
    }
}
public class BookStore {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<>();

        Book b1=new Book("123-456-789-0", "Fakhira", 9.0, 200);
        Book b2=new Book("321-654-709-8", "Kalpana Chawla", 9.5, 250);
        Book b3=new Book("231-464-589-0", "BharatRatna", 9.3, 180);
        Book b4=new Book("235-416-549-1", "Chhava", 9.8, 300);
        Book b5=new Book("311-590-787-9", "Man mein hai vishwas", 8.5, 220);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);

        list.sort(Comparator.comparing(Book :: getRating,Comparator.reverseOrder()).thenComparing(Book :: getPrice).thenComparing(Book :: getTitle).thenComparing(Book :: getIsbn));

        for(int i=0; i<list.size(); i++){
            System.out.println("Title: " + list.get(i).getTitle() + " ISBN: " + list.get(i).getIsbn() + " Price: " + list.get(i).getPrice() + " Rating: " + list.get(i).getRating());
        }
    }
}
