package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Result {
    private String name;
    private int[] marks;

    Result(String name,int[] marks){
        setName(name);
        setMarks(marks);
    }
    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Invalid";
        }
    }

    public String getName(){
        return name;
    }

     public void setMarks(int [] marks){
        if (marks==null) {
            this.marks=new int[3];
            return;
        }
        this.marks=new int[marks.length];

        for(int i=0; i<marks.length; i++){
            int val=marks[i];

            if (val<0) val=0;
            if (val>100) val=100;

            this.marks[i]=val;
        }
    }

    public int total(){
        int sum=0;
        for(int i=0; i<marks.length; i++){
            sum+=marks[i];
        }
        return sum;
    }

    public double average(){
        return (double)total()/marks.length;
    }

    abstract char calculateGrade();
    abstract boolean isPass();
   
    public void displayMarks(){
        System.out.println("Marks : ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

    public void displayResult(){
         System.out.println("Name : "+getName());
         System.out.println("-----");
        displayMarks();
        System.out.println("-----");
        System.out.println("Total : "+total());
        System.out.println("-----");
        System.out.println("Average : "+average());
        System.out.println("-----");
        System.out.println("Grade : "+calculateGrade());
        System.out.println("-----");
        if (isPass()) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        System.out.println("-----");
    }
}

class SchoolStudent extends Result {

    double avg=average();
    SchoolStudent(String name,int[] marks){
        super(name, marks);
    }

    @Override
    public boolean isPass(){
        return avg>40;
    }   

    @Override
    public char calculateGrade(){
        if (avg>=75) {
            return 'A';
        }
        if (avg>=60) {
            return 'B';
        }

        return 'C';
    }
}

class CollegeStudent extends Result {

    CollegeStudent(String name,int[] marks){
        super(name, marks);
    }

    @Override
    public boolean isPass(){
    double avg=average();
        return avg>50;
    }   

    @Override
    public char calculateGrade(){
    double avg=average();
        if (avg>=80) {
            return 'A';
        }
        if (avg>=65) {
            return 'B';
        }
        return 'C';
    }
}
public class Result_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int size=sc.nextInt();
        int[] marks=new int[size];

        for(int i=0; i<marks.length; i++){
            marks[i]=sc.nextInt();
        }

        Result r[]=new Result[2];
        r[0]=new SchoolStudent(name, marks);
        r[1]=new CollegeStudent(name, marks);

        for(int i=0; i<r.length; i++){
            r[i].displayResult();
        }
        sc.close();
    }
}
