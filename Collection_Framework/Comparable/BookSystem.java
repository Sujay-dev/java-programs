package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>{
    private String isbn;
    private String title;
    private double rating;
    private int price;

    Book(String isbn,String title,double rating,int price){
        setisBn(isbn);
        this.title=title;
        this.rating=rating;
        this.price=price;
    }
    public void setisBn(String isbn){
        isbn.replace("-", "");
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

    @Override
    public int compareTo(Book b){
        if(this.rating!=b.rating) return Double.compare(b.rating, this.rating);

        if(this.price!=b.price) return Integer.compare(this.price, b.price);

        if(!this.title.equals(b.title)) return this.title.compareTo(b.title);

        return this.isbn.compareTo(b.isbn);
    }
}
public class BookSystem {
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

        Collections.sort(list);

        for(int i=0; i<list.size(); i++){
            System.out.println("Isbn: " + list.get(i).getIsbn() + " Title: " + list.get(i).getTitle() + " Rating: " + list.get(i).getRating() + " Price: " + list.get(i).getPrice());
        }
    }
}
