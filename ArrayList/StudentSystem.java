package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String name;
    private int id;

    Student(String name, int id){
        setName(name);
        setID(id);
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

    public void setID(int id){
        if (id>0) {
            this.id=id;
        }else{
            this.id=0;
        }
    }

    public String getName(){
        return name;
    }

    public int getid(){
        return id;
    }
}
public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Student> students=new ArrayList<>();

        System.out.println("Enter Name & ID of Students");
        for(int i=0; i<5; i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();

            students.add(new Student(name, id));
        }

        System.out.println();

        for(Student s: students){
            System.out.println("Name: " + s.getName() + " ID: " + s.getid());
        }

        System.out.println();

        System.out.println("Enter ID for searching Student");
        int searchId=sc.nextInt();
        sc.nextLine();
        boolean found=false;

        for (Student s : students) {
            if (s.getid() == searchId) {
                System.out.println("Found- " + " Name: " + s.getName() + " ID: " + s.getid());
                found=true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }

        System.out.println();

        System.out.println("Enter ID for Updating");
        int updateId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name to Update");
        String newName=sc.nextLine();
        boolean update=false;

        for (Student s : students) {
            if (s.getid() == updateId) {
                s.setName(newName);
                update=true;
                break;
            }
        }

        if (update) {
            System.out.println("Updated");
        }else{
            System.out.println("Not Updated");
        }

        for(Student s: students){
            System.out.println("Name: " + s.getName() + " ID: " + s.getid());
        }

        System.out.println();

        System.out.println("Enter id for deleting");
        int deleteId=sc.nextInt();
        boolean delete=false;

        for(int i=0; i<students.size(); i++){
            if (students.get(i).getid() == deleteId) {
                students.remove(i);
                delete=true;
                break;
            }
        }

        if (delete) {
            System.out.println("Deleted");
        }else{
            System.out.println("Not deleted");
        }

         for(Student s: students){
            System.out.println("Name: " + s.getName() + " ID: " + s.getid());
        }

        System.out.println();

        Student highId=students.get(0);

        for (Student s : students) {
            if (s.getid() > highId.getid()) {
                highId=s;
            }
        }

        System.out.println("Person with Highest Id ");
        System.out.println("Name: "+ highId.getName());
        System.out.println("ID: " + highId.getid());
        sc.close();
    }
}
