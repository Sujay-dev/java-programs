package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class RankStudent{
    private int id;
    private String name;
    private int marks;

    RankStudent(int id, String name, int marks){
        setID(id);
        setName(name);
        setMarks(marks);
    }

      public void setID(int var1) {
      if (var1 > 0) {
         this.id = var1;
      } else {
         this.id = 0;
      }

   }

   public int getId() {
      return this.id;
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
public class DisplayTop3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        ArrayList<RankStudent> students=new ArrayList<>();

        for(int i=0; i<5; i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            int marks=sc.nextInt();

            students.add(new RankStudent(id, name,marks));
        }

        Collections.sort(students,(a,b) -> b.getMarks()-a.getMarks());

        System.out.println("-----------Rank List(Top 3 Students)----------");
        int count=0;
        for (RankStudent s : students) {
            System.out.println("ID- " + s.getId() + " Name: " + s.getName() + " Marks: " + s.getMarks());
            count++;

            if (count==3) {
                break;
            }
        }

        sc.close();
    }
}
