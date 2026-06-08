package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Book{
    private int id;
    private String title;
    private String author;

    Book(int id,String title,String author){
        setID(id);
        setTitle(title);
        setAuthor(author);
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

    public void setTitle(String title){
        if (title!=null && !title.isEmpty()) {
            this.title=title;
        }else{
            this.title="Invalid";
        }
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        if (author!=null && !author.isEmpty()) {
            this.author=author;
        }else{
            this.author="Invalid";
        }
    }

    public String getAuthor(){
        return author;
    }

    public void displayBook(){
        System.out.println("ID: " + getId() + " Title: " + getTitle() + " Author: " + getAuthor());
    }
}
public class BookSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Book> books=new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 for Add Book");
            System.out.println("Enter 2 for Search Book");
            System.out.println("Enter 3 for update title");
            System.out.println("Enter 4 for Delete Book");
            System.out.println("Enter 5 for View All Books");
            System.out.println("Enter 6 for view books Sorted by title");
            System.out.println("Enter 7 for view Total Count of Books");
            System.out.println("Enter 8 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Title: ");
                    String title=sc.nextLine();
                    System.out.println("Enter Author: ");
                    String author=sc.nextLine();

                    boolean exists=false;

                    for (Book b : books) {
                        if (b.getId()==id) {
                            exists=true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("ID already Exits");
                        break;
                    }else{
                        books.add(new Book(id, title, author));
                        System.out.println("Book Added");
                    }
                    System.out.println();

                    break;
            
                case 2:
                    System.out.println("Enter Id for searching book: ");
                    int searchId=sc.nextInt();
                    boolean found=false;

                    for (Book b : books) {
                        if (b.getId()==searchId) {
                            b.displayBook();
                            found=true;
                        }
                    }

                    if (!found) {
                        System.out.println("Not Found");
                    }
                    System.out.println();

                    break;

                case 3:
                    System.out.println("Enter Id for Updating Title: ");
                    int updateId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter New Title: ");
                    String newTitle=sc.nextLine();
                    boolean update=false;

                    for (Book b : books) {
                        if (b.getId()==updateId) {
                            b.setTitle(newTitle);
                            update=true;
                        }
                    }

                    if (update) {
                        for (Book b : books) {
                            b.displayBook();
                            System.out.println("Updated !");
                        }
                    }else{
                        System.out.println("Not Updated");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Enter Id for deleting Book");
                    int deleteId=sc.nextInt();
                    boolean delete=false;

                    for(int i=0; i<books.size(); i++){
                        if (books.get(i).getId()==deleteId) {
                            books.remove(i);
                            delete=true;
                        }
                    }

                    if (delete) {
                        for (Book b : books) {
                            b.displayBook();
                            System.out.println("Deleted !");
                        }
                    }else{
                        System.out.println("Not Deleted");
                    }
                    System.out.println();
                    break;

                case 5:
                    for (Book b : books) {
                        b.displayBook();
                    }
                    System.out.println();
                    break;

                case 6:
                    Collections.sort(books,(a,b) -> a.getTitle().compareTo(b.getTitle()));

                    System.out.println("Books Sorted by Title: ");
                    for (Book b : books) {
                        b.displayBook();
                    }
                    System.out.println();
                    break;

                case 7:
                    int count=0;
                    for(int i=0; i<books.size(); i++){
                        count++;
                    }

                    System.out.println("Total Books: " + count);

                    System.out.println();
                    break;

                case 8:
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
