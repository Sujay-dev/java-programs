package OOPS.Inheritance;

import java.util.Scanner;

class Learner {
    private String name;
    private int rollno;

    Learner(String name, int rollno){
        setName(name);
        setRollno(rollno);
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknowm";
        }
    }

    public String getName(){
        return name;
    }

    public void setRollno(int rollno){
        if (rollno>0) {
            this.rollno=rollno;
        }else{
            this.rollno=0;
        }
    }

    public int getRollno(){
        return rollno;
    }

    public void displayStudent(){
        System.out.println("Name : "+getName());
        System.out.println("Roll no : "+getRollno());
    }
}

class Result extends Learner{
    private int[] marks;

    Result(String name, int rollno,int [] marks){
        super(name, rollno);
        setMarks(marks);
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

    public int highest(){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<marks.length; i++){
            if (marks[i]>max) {
                max=marks[i];
            }
        }
        return max;
    }

    public void displayMarks(){
        System.out.println("Marks : ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

    public void displayResult(){
        displayStudent();
        displayMarks();
        System.out.println("Total Marks : "+total());
        System.out.println("Average Marks : "+average());
        System.out.println("Highest Marks : "+highest());
    }
}
public class Stud_Result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int rollno=sc.nextInt();
        int size=sc.nextInt();
        int[] marks=new int[size];

        for(int i=0; i<marks.length; i++){
            marks[i]=sc.nextInt();
        }

        Result result=new Result(name, rollno, marks);
        result.displayResult();
        sc.close();
    }
}
