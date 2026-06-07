package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Movie{
    private int id;
    private String title;
    private double ratings;

    Movie(int id,String title,double ratings){
        setID(id);
        setTitle(title);
        setRating(ratings);;
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

    public void setRating(double rating){
        if (rating>0) {
            this.ratings=rating;
        }else{
            this.ratings=0;
        }
    }
    
    public double getRatings(){
        return ratings;
    }

    public void displayMovies(){
        System.out.println("ID: " + getId() + " Title: " + getTitle() + " Author: " + getRatings());
    }
}
public class MoviesRatings {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

        ArrayList<Movie> movies=new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 for Add Movie");
            System.out.println("Enter 2 view Movies Sorted by Ratings");
            System.out.println("Enter 3 for find best Movie");
            System.out.println("Enter 4 for view Average Rarings and  Movies rating is above average");
            System.out.println("Enter 5 for View All Movies");
            System.out.println("Enter 6 for Exit");

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
                    System.out.println("Enter Ratings: ");
                    double ratings=sc.nextDouble();

                    boolean exists=false;

                    for (Movie m: movies) {
                        if (m.getId()==id) {
                            exists=true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("ID already Exits");
                        break;
                    }else{
                        movies.add(new Movie(id, title, ratings));
                        System.out.println("Movie Added");
                    }
                    System.out.println();

                    break;
            
                case 2:
                   Collections.sort(movies,(a,b) -> Double.compare(b.getRatings(),a.getRatings()));

                   System.out.println("---------Movies Rank(By Ratings)---------");
                   for (Movie m : movies) {
                    m.displayMovies();
                   }

                   System.out.println();
                    break;

                case 3:
                    if (movies.isEmpty()) {
                        System.out.println("No Movies available");
                        break;
                    }

                    Movie highrating=movies.get(0);

                    for (Movie m : movies) {
                        if (m.getRatings()>highrating.getRatings()) {
                            highrating=m;
                        }
                    }

                    System.out.println("Best Movie(According to Ratings)");
                    System.out.println("ID: " + highrating.getId());
                    System.out.println("Title: " + highrating.getTitle());
                    System.out.println("Ratings: " + highrating.getRatings());
                    System.out.println();
                    break;

                case 4:
                    int sum=0;

                    for(Movie m: movies){
                        sum+=m.getRatings();
                    }

                    double avg=(double)sum/movies.size();

                    System.out.println("Average Rating is : " + avg);

                    boolean above=false;
                    System.out.println("Movies Above average");

                    for (Movie m : movies) {
                        if (m.getRatings()>avg) {
                            m.displayMovies();
                            above=true;
                        }
                    }

                    if (!above) {
                        System.out.println("No Movie Above Average Ratings");
                    }
                    System.out.println();
                    break;

                case 5:
                    Collections.sort(movies,(a,b) -> a.getId()-b.getId());
                    
                    for (Movie m: movies) {
                        m.displayMovies();
                    }
                    System.out.println();
                    break;

                case 6:
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
