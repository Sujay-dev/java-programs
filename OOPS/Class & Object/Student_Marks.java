package Revision;

import java.util.Scanner;

class Result{
    private String name; 
    private int m1;
    private int m2;
    private int m3;

    Result(String name,int m1,int m2, int m3){
        setName(name);
        setMarks(m1, m2, m3);
    }

    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }else{
            this.name="Unknown";
        }
    }

   public void setMarks(int m1, int m2, int m3){
        if(valid(m1) && valid(m2) && valid(m3)){
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        } else {
            System.out.println("Invalid marks (0–100 only)");
        }
    }
    public boolean valid(int m){
        return (m>=0) && (m<=100);
    }

    public int total(){
        return m1+m2+m3;
    }

    public double percentage(){
        return total()/3.0;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + m1+ " " + m2+ " " + m3);
        System.out.println("Total: " + total());
        System.out.println("Percentage: " + percentage());
    }
}
public class Student_Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();

        Result result=new Result(name,m1,m2,m3);
        result.display();
        sc.close();
    }
}
