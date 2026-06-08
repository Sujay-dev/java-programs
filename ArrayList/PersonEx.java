package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person{
    private int id;
    private String name;

    Person(int id, String name){
        setID(id);
        setName(name);
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

}
public class PersonEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Person> persons=new ArrayList<>();

        for(int i=0; i<5; i++){
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();

            persons.add(new Person(id, name));
        }

        for (Person p : persons) {
            System.out.println(p.getId() + " : " + p.getName());
        }

        System.out.println();
        
        Collections.sort(persons, (a,b) -> a.getName().compareTo(b.getName()) );

        for (Person p : persons) {
            System.out.println(p.getId() + " : " + p.getName());
        }
        sc.close();
    }
}
