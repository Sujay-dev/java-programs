package Revision;

import java.util.HashSet;

class Users{
    private int id;
    private String name;

    Users(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Users)) return false;
        Users other=(Users) obj;
        return this.id==other.id;
    }
    @Override
    public int hashCode(){
        return this.id;
    }
}
public class UserEx {
    public static void main(String[] args) {
        HashSet<Users> set=new HashSet<>();

        set.add(new Users(101, "Sujay"));
        set.add(new Users(102, "Suyash"));
        set.add(new Users(101, "Rohan"));
        set.add(new Users(103, "Vedant"));
        set.add(new Users(104, "Parth"));

        for (Users u : set) {
            System.out.println(u.getId() + " " +u.getName());
        }
    }
}
