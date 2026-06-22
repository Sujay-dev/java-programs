package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{
    private String name;
    private double rating;

    Movie(String name,double rating){
        this.name=name;
        this.rating=rating;
    }

    public String getName(){
        return name;
    }
    public double getRating(){
        return rating;
    }

    @Override
    public int compareTo(Movie m){
        return Double.compare(m.getRating(),this.getRating());
    }
}
public class MovieRating {
        public static void main(String[] args) {
        ArrayList<Movie> list=new ArrayList<>();

        Movie m1=new Movie("Dhurandhar", 9.5);
        Movie m2=new Movie("Dhurandhar 2", 9.9);
        Movie m3=new Movie("Alpha", 5.0);
        list.add(m1);
        list.add(m2);
        list.add(m3);

        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getName() + " : " + list.get(i).getRating());
        }
    }
}
