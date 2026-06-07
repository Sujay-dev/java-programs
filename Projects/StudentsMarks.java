package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StudentsEx{
    private String name;
    private int marks;

    StudentsEx(String name, int marks){
        setName(name);
        setMarks(marks);
    }

     public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public String getName(){
        return name;
    }

    public void setMarks(int marks){
        if (marks>=0 && marks<=100) {
            this.marks=marks;
        }else{
            this.marks=0;
        }
    }

    public int getMarks(){
        return marks;
    }
}
public class StudentsMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<StudentsEx> students=new ArrayList<>();

        for(int i=0; i<5; i++){
            String name=sc.nextLine();
            int marks=sc.nextInt();
            sc.nextLine();

            students.add(new StudentsEx(name, marks));
        }

        for (StudentsEx s : students) {
            System.out.println(s.getName() + " : " + s.getMarks());
        }

        System.out.println();

        Collections.sort(students, (a,b) -> b.getMarks()-a.getMarks());

        System.out.println("Highest-------->Lowest");
        for (StudentsEx s : students) {
            System.out.println(s.getName() + " : " + s.getMarks());
        }

        System.out.println();

        Collections.sort(students, (a,b) -> a.getMarks()-b.getMarks());

        System.out.println("Lowest--------->Highest");
        for (StudentsEx s : students) {
            System.out.println(s.getName() + " : " + s.getMarks());
        }
        sc.close();
    }
}
