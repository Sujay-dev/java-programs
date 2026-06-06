package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MultiStudents{
    private int id;
    private String name;
    private int marks;

    MultiStudents(int id,String name, int marks){
        setID(id);
        setName(name);
        setMarks(marks);
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
public class MultiComparetor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<MultiStudents> students=new ArrayList<>();

        for(int i=0; i<5; i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int marks=sc.nextInt();

            students.add(new MultiStudents(id, name, marks));
        }

        for (MultiStudents m : students) {
            System.out.println(m.getId() + " - " + m.getName() + " : " + m.getMarks());
        }

        System.out.println();

        Collections.sort(students,(a,b) -> b.getMarks()-a.getMarks());

        System.out.println("Marks Descending");
        for (MultiStudents m : students) {
            System.out.println(m.getId() + " - " + m.getName() + " : " + m.getMarks());
        }

        System.out.println();

        Collections.sort(students,(a,b) -> a.getName().compareTo(b.getName()));

        System.out.println("Name Ascending");
        for (MultiStudents m : students) {
            System.out.println(m.getId() + " - " + m.getName() + " : " + m.getMarks());
        }

        System.out.println();

        Collections.sort(students,(a,b) -> a.getId()-b.getId());

        System.out.println("ID ascending");
        for (MultiStudents m : students) {
            System.out.println(m.getId() + " - " + m.getName() + " : " + m.getMarks());
        }

        sc.close();
    }
}
