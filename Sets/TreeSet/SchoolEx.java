package Revision_2;

import java.util.Comparator;
import java.util.TreeSet;

class School{
    private int id;
    private String name;
    private int marks;

    School(int id,String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
}
public class SchoolEx {
    public static void main(String[] args) {
        TreeSet<School> set=new TreeSet<>(Comparator.comparingInt(School :: getMarks).reversed().thenComparing(Comparator.comparing(School :: getName).thenComparing(School :: getId)));

        School s1=new School(101, "Sujay", 82);
        School s2=new School(102, "Suyash", 68);
        School s3=new School(103, "Vedant", 63);
        School s4=new School(104, "Rohan", 68);
        School s5=new School(105, "Athrava", 70);
        School s6=new School(106, "Abhi", 70);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);

        System.out.println();
        for (School s : set) {
            System.out.println(s.getId() + " " + s.getName() + " " +s.getMarks());
        }

        School first=set.first();
        set.remove(first);
        School second=set.first();
        System.out.println("\nTop Two Students: ");
        System.out.println(first.getId() + " " +first.getName() + " " + first.getMarks());
        System.out.println(second.getId() + " " + second.getName() + " " + second.getMarks());
    }
}
