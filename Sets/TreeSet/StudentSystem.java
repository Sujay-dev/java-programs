package Sets.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student {
    private String name;
    private int marks;

    Student(String name,int marks){
        this.marks=marks;
        this.name=name;
    }
    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
}
public class StudentSystem {
    public static void main(String[] args) {
        TreeSet<Student> set=new TreeSet<>(Comparator.comparing(Student :: getMarks).reversed().thenComparing(Comparator.comparing(Student :: getName)));

        Student s1=new Student("Sujay",82);
        Student s2=new Student("Vedant", 62);
        Student s3=new Student("Sujay", 54);
        Student s4=new Student("Rohan", 68);
        Student s5=new Student("Vedant", 45);
        Student s6=new Student("Suyash", 67);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);

        Iterator<Student> it=set.iterator();
        System.out.println("Leaderboard: ");
        while (it.hasNext()) {
            Student s=it.next();
            System.out.println(s.getName() + " " + s.getMarks());
        }
    }
}
