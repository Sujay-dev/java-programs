package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

class Students{
    private int id;
    private String name;
    private int marks;

    Students(int id , String name , int marks){
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
public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Students> student=new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 for Add Student");
            System.out.println("Enter 2 for view Student");
            System.out.println("Enter 3 for search Student");
            System.out.println("Enter 4 for update marks");
            System.out.println("Enter 5 delete student");
            System.out.println("Enter 6 for view highest marks");
            System.out.println("Enter 7 for view lowest marks");
            System.out.println("Enter 8 for view average marks");
            System.out.println("Enter 9 for view how many students passed");
            System.out.println("Enter 10 for view how student failed");
            System.out.println("Enter 11 for Exit");

            System.out.println();

            int choice=sc.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name");
                    String name=sc.nextLine();
                    System.out.println("Enter marks");
                    int marks=sc.nextInt();

                    boolean exists=false;
                    for (Students s : student) {
                        if (s.getID()==id) {
                            exists=true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("ID already exits");
                    }else{
                        student.add(new Students(id, name, marks));
                        System.out.println("Student Added");
                    }
                    break;
            
                case 2:
                    for (Students s : student) {
                        System.out.println("ID: " + s.getID() + " Name: " + s.getName() + " Marks: " + s.getMarks());
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter Id for search");
                    int searchId=sc.nextInt();
                    boolean found=false;
                    for (Students s : student) {
                        if (s.getID()==searchId) {
                            System.out.println("Found- " + " ID: " + s.getID() + " Name: " + s.getName() + " Marks: " + s.getMarks());
                            found=true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Not Found");
                    }
                    System.out.println();
                    break;
                
                case 4:
                    System.out.println("Enter id for update marks");
                    int updateId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Marks");
                    int updatemarks=sc.nextInt();
                    boolean update=false;

                    for (Students s : student) {
                        if (s.getID()==updateId) {
                            s.setMarks(updatemarks);
                            update=true;
                        }
                    }

                    if (update) {
                        System.out.println("Updated");
                        for (Students s : student) {
                             System.out.println("ID: " + s.getID() + " Name: " + s.getName() + " Marks: " + s.getMarks());
                        }
                    }else{
                        System.out.println("Not Updated something is Wrong");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Enter id for delete");
                    int deleteId=sc.nextInt();
                    boolean delete=false;

                    for(int i=0; i<student.size(); i++){
                        if (student.get(i).getID()==deleteId) {
                            student.remove(i);
                            delete=true;
                        }
                    }

                    if (delete) {
                        System.out.println("Deleted");
                        for (Students s : student) {
                             System.out.println("ID: " + s.getID() + " Name: " + s.getName() + " Marks: " + s.getMarks());
                        }
                    }else{
                        System.out.println("Not deleted something wrong");
                    }
                    System.out.println();
                    break;

                case 6:
                    if (student.isEmpty()) {
                        System.out.println("No students available");
                        break;
                    }

                    Students highMarks=student.get(0);

                    for (Students s : student) {
                        if (s.getMarks() > highMarks.getMarks()) {
                            highMarks=s;
                        }
                    }

                    System.out.println("student with Highest marks is ");
                    System.out.println("ID: " + highMarks.getID());
                    System.out.println("Name: " + highMarks.getName());
                    System.out.println("Marks: " + highMarks.getMarks());

                    System.out.println();
                    break;

                case 7:
                    if (student.isEmpty()) {
                        System.out.println("No students available");
                        break;
                    }

                    Students lowMarks=student.get(0);

                    for (Students s : student) {
                        if (s.getMarks() < lowMarks.getMarks()) {
                            lowMarks=s;
                        }
                    }

                    System.out.println("student with Lowest marks is ");
                    System.out.println("ID: " + lowMarks.getID());
                    System.out.println("Name: " + lowMarks.getName());
                    System.out.println("Marks: " + lowMarks.getMarks());

                    System.out.println();
                    break;

                case 8:
                    if (student.isEmpty()) {
                        System.out.println("No students available");
                        break;
                    }
                    
                    int sum=0;
                    for (Students s : student) {
                        sum+=s.getMarks();
                    }

                    double avg=(double)sum/student.size();

                    System.out.println("Average Marks are : " + avg);
                    System.out.println();
                    break;

                case 9:
                    int pass=0;
                    for (Students s : student) {
                        if (s.getMarks()>=40) {
                            pass++;
                        }
                    }

                    System.out.println("Student Passed : " + pass);
                    System.out.println();
                    break;

                case 10:
                    int fail=0;
                    for (Students s : student) {
                        if (s.getMarks()<40) {
                            fail++;
                        }
                    }

                    System.out.println("Student Failed: " + fail);
                    System.out.println();
                    break;

                case 11:
                    System.out.println("Exited !");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
