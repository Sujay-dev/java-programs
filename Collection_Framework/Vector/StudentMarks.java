package CollectionFramework.Vector;

import java.util.Scanner;
import java.util.Vector;

class Student{
    private int id;
    private String name;
    private int marks;

    Student(int id, String name, int marks){
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

    public int getID(){
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
public class StudentMarks {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        Vector<Student> vector=new Vector<>();
        
        for(int i=0; i<5; i++){
            System.out.println("Enter ID: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name: ");
            String name=sc.nextLine();
            System.out.println("Enter Marks: ");
            int marks=sc.nextInt();

            boolean exits=false;
            for (Student s : vector) {
                if (s.getID()==id) {
                    exits=true;
                    break;
                }
            }

            if (exits) {
                System.out.println("Duplicate ID Enter Again !");
            }else{
                vector.add(new Student(id, name, marks));
                System.out.println("Student Added !");
                System.out.println();
            }
        }

        System.out.println("Student List");
        for (Student s : vector) {
            System.out.println("ID: "+ s.getID() + " Name: " + s.getName() + " Marks: " + s.getMarks());
        }

        System.out.println();
        
        Student topper = vector.get(0);
        for(Student s : vector){
         if(s.getMarks() > topper.getMarks()){
        topper = s;
        }
    }

             System.out.println("Student with Highst marks: ");
             System.out.println("ID: "+ topper.getID());
             System.out.println("Name: "+ topper.getName());
             System.out.println("Marks: " + topper.getMarks());
        
    }
}
