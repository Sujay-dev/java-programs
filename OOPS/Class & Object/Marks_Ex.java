package OOPS.Class_Object;

import java.util.Scanner;

class Marks {
    private String name;
    private int[] marks;

    Marks(){
        this("Unknown",new int[3]);
    }

    Marks(String name){
        this(name,new int[3]);
    }

    Marks(String name,int[] marks){
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
        double avg=(double)total()/marks.length;
        return avg;
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
    public void display(){
        System.out.println("Name : "+ name+ "  Total : "+ total()+ "  Highest : "+highest() + "  Average : "+ average());
    }
}
public class Marks_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println("Hello "+ name+ " Please enter next details ");
        System.out.println("Enter size of array : ");
        int size=sc.nextInt();
        int[] marks=new int[size];
                
        System.out.println("Enter marks : ");    
        for(int i=0; i<size; i++){
            marks[i]=sc.nextInt();
        }

        Marks m0=new Marks();
        m0.display();

        Marks m1=new Marks(name);
        m1.display();

        Marks m2=new Marks(name,marks);
        m2.displayMarks();
        System.out.println("Total Marks : "+m2.total());
        System.out.println("Highest Marks : "+m2.highest());
        System.out.println("Average of marks : "+ m2.average());
        m2.display();
        sc.close();
    }
}
