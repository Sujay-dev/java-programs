package CollectionUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class Student{
    private int id;
    private String name;
    private int marks;

    Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
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
    @Override
    public String toString(){
        return "ID-" + getId() + " Name- " + getName() + " Marks- " + getMarks();
    }
}
public class StudentEx {
    public static void main(String[] args) {
        HashMap<Integer,Student> map=new HashMap<>();

        Student s1=new Student(101, "Sujay", 82);
        Student s2=new Student(102, "Suyash", 68);
        Student s3=new Student(103, "Suraj", 80);
        Student s4=new Student(104, "Rohan", 68);
        Student s5=new Student(105, "Vedant", 62);
        Student s6=new Student(106, "Om", 78);
        Student s7=new Student(107, "Abhi", 81);
        Student s8=new Student(108, "Aakash", 73);

        map.put(s1.getId(), s1);
        map.put(s2.getId(), s2);
        map.put(s3.getId(), s3);
        map.put(s4.getId(), s4);
        map.put(s5.getId(), s5);
        map.put(s6.getId(), s6);
        map.put(s7.getId(), s7);
        map.put(s8.getId(), s8);

        ArrayList<Student> list=new ArrayList<>(map.values()); //map.values for copying map values to list

       // Collections.addAll(list, s1,s2,s3,s4,s5,s6,s7,s8); this is manual way you can do addAll(map.values);

        list.sort(Comparator.comparing(Student :: getMarks).reversed().thenComparing(Comparator.comparing(Student :: getName)).thenComparing(Student :: getId));

        System.out.println("Student Ranking: ");
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("\nShuffled list: ");
        Collections.shuffle(list);

        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println("\nReversed List: ");
        Collections.reverse(list);

        for (Student s : list) {
            System.out.println(s);
        }

        Student topper=Collections.max(list, Comparator.comparing(Student :: getMarks));

        System.out.println("\nTopper: " + topper);

        Student lowest=Collections.min(list, Comparator.comparing(Student :: getMarks));

        System.out.println("\nLowest Score: " +lowest);

        System.out.println("\nFinal List: ");
        for (Student s : list) {
            System.out.println(s);
        }

    }
}
