package Maps.Treemap;

import java.util.Comparator;
import java.util.TreeMap;

class Candidate{
    private int id;
    private String name;
    private double score;

    Candidate(int id,String name,double score){
        this.id=id;
        this.name=name;
        this.score=score;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }
}
public class JobSystem {
    public static void main(String[] args) {
        TreeMap<Candidate,String> map=new TreeMap<>(Comparator.comparing(Candidate :: getScore).reversed().thenComparing(Comparator.comparing(Candidate :: getId)));

        Candidate c1=new Candidate(103, "Sujay", 82.0);
        Candidate c2=new Candidate(101, "Suyash", 67.70);
        Candidate c3=new Candidate(102, "Vedant", 63.0);
        Candidate c4=new Candidate(105, "Rohan", 68.34);
        Candidate c5=new Candidate(104, "Parth", 78.0);

        map.put(c1, "Candidate");
        map.put(c2, "Candidate");
        map.put(c3, "Candidate");
        map.put(c4, "Candidate");
        map.put(c5, "Candidate");

        for (var s : map.entrySet()) {
            System.out.println("ID: " + s.getKey().getId() + " Name: " + s.getKey().getName() + " Score: " + s.getKey().getScore());
        }

        System.out.println();
        System.out.println("Top Candidate : ");
        System.out.println("ID: " + map.firstKey().getId() + " Name: " + map.firstKey().getName() + " Score: " + map.firstKey().getScore());

        System.out.println();
        System.out.println("Top 3 Candidate: ");
        int count=0;
        for (var s : map.entrySet()) {
            System.out.println("ID: " + s.getKey().getId() + " Name: " + s.getKey().getName() + " Score: " + s.getKey().getScore());
            count++;
            if (count==3) {
                break;
            }
        }
    }
}
