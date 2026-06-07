package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

class Names{
     private int id;
    private String name;

    Names(int id,String name){
        setID(id);
        setName(name);
        
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
}

public class RemoveDuplicateObject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Names> names=new ArrayList<>();

        while(names.size()<5){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();

             boolean exists=false;
             
            for (Names n : names) {
                if (n.getId()==id) {
                    exists=true;
                    break;
                }
            }
             if (exists) {
             System.out.println("Duplicate ID Enter again");
             continue;
            }

            names.add(new Names(id, name));
        }

        for (Names n : names) {
            System.out.println(n.getId() + " " + n.getName());
        }
        sc.close();
    }
}
