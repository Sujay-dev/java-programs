import java.util.Scanner;

class Students{
    private String name;
    private int s1;
    private int s2;
    private int s3;

    Students(String name){
        setName(name);
    }
    public void setName(String name){
        if (name!=null && !name.isEmpty()) {
            this.name=name;
        }
        else{
            this.name="Unknown";
        }
    }

    public void setMarks(int s1, int s2, int s3){
        if(valid(s1) && valid(s2) && valid(s3)){
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        } else {
            System.out.println("Invalid marks (0–100 only)");
        }
    }

    private boolean valid(int m){
        return m >= 0 && m <= 100;
    }

    public int getTotal(){
        return (s1+s2+s3);
    }

    public double getPercentage(){
       return getTotal()/3.0;
    }

    public String getGrade(){
        double p=getPercentage();
        if (p>=75) return "A";
        if (p>=60) return "B";
        if (p>=40) return "C";
        return "Fail";
    }

    public String getResult(){
        if (s1<40 || s2<40 || s3<40) {
            return "Fail";
        }
        return "Pass";
    }

    public void displayReport(){
        System.out.println("--------Report Card------------");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + s1 + " " + s2 + " " + s3);
        System.out.println("Total : " + getTotal());
        System.out.println("Percentage: " + getPercentage());
        System.out.println("Grade: " + getGrade());
        System.out.println("Result: " + getResult());
        System.out.println("----------------------------------");
    }
}
public class Student_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();

        Students stud=new Students(name);

        while (true) {
            System.out.println("1. Enter Marks");
             System.out.println("2. Total & percentage");
             System.out.println("3. Grade");
             System.out.println("4. Result");
             System.out.println("5. Full Report");
             System.out.println("6. Exit");

             int choice=sc.nextInt();

             switch (choice) {
                case 1:
                    int m1=sc.nextInt();
                    int m2=sc.nextInt();
                    int m3=sc.nextInt();
                    System.out.println((m1)+" "+ (m2) + " "+ (m3));
                    stud.setMarks(m1, m2, m3);
                    break;
             
                case 2:
                    System.out.println("Total: " + stud.getTotal());
                    System.out.println("Percentage: " + stud.getPercentage());
                    break;

                case 3:
                    System.out.println("Grade: " + stud.getGrade());
                    break;

                case 4:
                    System.out.println("Result: " + stud.getResult());
                    break;

                case 5:
                    stud.displayReport();
                    break;

                case 6:
                    System.out.println("Exited");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid");
                    break;
             }
        }
    }
}
