package Sets.HashSet;

import java.util.HashSet;

class Student{
    private int id;
    
    Student(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    @Override
    public boolean equals(Object s){
        if(!(s instanceof Student)) return false;
        Student other=(Student) s;
        return this.id==other.id;
    }
    @Override
    public int hashCode(){
        return this.id;
    }
}
public class StudentSystem {
     public static void main(String[] args) {
        HashSet<Student> set=new HashSet<>();

        set.add(new Student(101));
        set.add(new Student(101));

        System.out.println(set.size());
    }
}
