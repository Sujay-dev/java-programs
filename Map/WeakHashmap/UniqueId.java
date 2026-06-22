package Maps.WeakHashmap;

import java.util.WeakHashMap;

class Student2{
    private int id;
  
    Student2(int id){
        this.id=id;
    }

     public int getId(){
        return id;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Student2)) return false;
        Student2 other=(Student2) obj;
        return this.id==other.id;
    }

    @Override
    public int hashCode(){
        return this.id;
    }
}
public class UniqueId {
    public static void main(String[] args) {
        WeakHashMap<Student2,String> map=new WeakHashMap<>();

        Student2 s1=new Student2(101);
        Student2 s2=new Student2(101 );
        Student2 s3=new Student2(103);

        map.put(s1, "Sujay");
        map.put(s2, "Vedant");
        map.put(s3, "Rohan");

        System.out.println(map.size());

        for (var s : map.entrySet()) {
            System.out.println(s.getKey().getId() + " -> " + s.getValue());
        }
    }
}
