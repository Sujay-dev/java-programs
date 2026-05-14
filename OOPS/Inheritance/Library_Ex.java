package OOPS.Inheritance;

import java.util.Scanner;

class Book {
    private String title;
    private String auther;
    private int price;
    
    Book(String title,String auther,int price){
        setInfo(title, auther);
        setPrice(price);
    }

    public void setInfo(String title,String auther){
        if ((title!=null && !title.isEmpty()) && (auther!=null && !auther.isEmpty())) {
            this.title=title;
            this.auther=auther;
        }else{
            this.title="Unknown";
            this.auther="Unknown";
        }
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

    public int discount(int percent){
        int discount=getPrice()*percent/100;
        return discount;
    }

    public void displayBook(){
        System.out.println("Title : "+title);
        System.out.println("Auther : "+auther);
        System.out.println("Price after discount : "+(getPrice()-discount(10)));
    }
}

class Library extends Book{
    private boolean issued;
    private int dayslate;

    Library(String title,String auther,int price,boolean issued,int dayslate){
        super(title, auther, price);
        setIssued(issued);
        setDays(dayslate);
    }

    public void setIssued(boolean issued){
            this.issued=issued;
    }

    public boolean getIssued(){
        return issued;
    }

    public void setDays(int dayslate){
        if (dayslate>0) {
            this.dayslate=dayslate;
        }else{
            this.dayslate=0;
        }
    }

    public int getDays(){
        return dayslate;
    }

    public int fine(){
        return dayslate*10;
    }

    public void displayLibrarybook(){
        displayBook();
        System.out.println("Issued : "+getIssued());
        System.out.println("Days late  : "+getDays());
        System.out.println("Fine : "+fine());
    }
}
public class Library_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String title=sc.nextLine();
        String auther=sc.nextLine();
        int price=sc.nextInt();
        sc.nextLine();
        boolean issued=sc.nextBoolean();
        int dayslate=sc.nextInt();

        Library library=new Library(title, auther, price, issued, dayslate);
        library.displayLibrarybook();
        sc.close();
    }
}
