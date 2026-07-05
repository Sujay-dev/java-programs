package Revision;

import java.util.Comparator;
import java.util.TreeSet;

class School{
    private int id;
    private String name;
    private int marks;

    School(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getID(){
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
        TreeSet<School> set=new TreeSet<>(Comparator.comparing(School :: getMarks).reversed().thenComparing(Comparator.comparing(School :: getName).thenComparing(School :: getID)));

        set.add(new School(101, "Sujay", 82));
        set.add(new School(102, "Suyash", 68));
        set.add(new School(101, "Vedant", 63));
        set.add(new School(104, "Suyash", 80));
        set.add(new School(105, "Gaurav", 78));

        for (School s : set) {
            System.out.println(s.getID() + " " + s.getName() + " " +s.getMarks());
        }
    }
}
