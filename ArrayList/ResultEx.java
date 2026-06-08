package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StudentMarks{
     private int id;
    private String name;
    private int marks;

    StudentMarks(int id,String name, int marks){
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
public class ResultEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<StudentMarks> students=new ArrayList<>();

        for(int i=0; i<10; i++){
            System.out.println("Enter ID: ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name: ");
            String name=sc.nextLine();
            System.out.println("Enter Marks: ");
            int marks=sc.nextInt();

            boolean exists=false;
            for (StudentMarks s : students) {
                if (s.getId()==id) {
                    exists=true;
                }
            }

            if (exists) {
                System.out.println("ID already Exits");
            }else{
            students.add(new StudentMarks(id, name, marks));
            System.out.println("Student Added");
            System.out.println();
            }
        }

        System.out.println("---------Student List-------");
        for (StudentMarks m : students) {
            System.out.println("ID - "+ m.getId() + " - " + " Name: " + m.getName() + "  " + "Marks: " + m.getMarks());
        }

        Collections.sort(students,(a,b) -> b.getMarks()-a.getMarks());

        System.out.println("-------Rank List-----------");
        for (StudentMarks m : students) {
            System.out.println("ID - "+ m.getId() + " - " + " Name: " + m.getName() + "  " + "Marks: " + m.getMarks());
        }

        System.out.println();

        if (students.isEmpty()) {
            System.out.println("No students available");
            sc.close();
            return;
        }

        StudentMarks topper=students.get(0);

        for (StudentMarks s : students) {
            if (s.getMarks()>topper.getMarks()) {
                topper=s;
            }
        }

        System.out.println("Topper of Class is ");
        System.out.println("ID : " + topper.getId());
        System.out.println("Name: "+ topper.getName());
        System.out.println("Marks: "+ topper.getMarks());

        System.out.println();

         if (students.isEmpty()) {
            System.out.println("No students available");
            sc.close();
            return;
        }
        
        StudentMarks lowestScore=students.get(0);

        for (StudentMarks s : students) {
            if (s.getMarks()<lowestScore.getMarks()) {
                lowestScore=s;
            }
        }

        System.out.println("Lowest Score of Class is ");
        System.out.println("Marks: "+ lowestScore.getMarks());

        System.out.println();

        int sum=0;

        for(StudentMarks s: students){
            sum+=s.getMarks();
        }

        double avg=(double)sum/students.size();

        System.out.println("Average Marks are: " + avg);

        System.out.println();

         System.out.println("Studets above Average");
         boolean above=false;
        for (StudentMarks s : students) {
            if (s.getMarks()>avg) {
                System.out.println("ID: " + s.getId() + " - " + " Name: " + s.getName() + "  " + "Marks: "+ s.getMarks());
                above=true;
            }
        }

        if (!above) {
            System.out.println("No student Above Average");
        }
        sc.close();
    }
}
