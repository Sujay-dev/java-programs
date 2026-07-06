package Revision_2;

import java.util.HashSet;

class User{
    private int userId;
    private String email;

    User(int userId,String email){
        this.userId=userId;
        this.email=email;
    }
    public int getId(){
        return userId;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof User)) return false;
        User other=(User) obj;
        return this.userId==other.userId;
    }
    @Override
    public int hashCode(){
        return this.userId;
    }
}
public class UserEx {
    public static void main(String[] args) {
        HashSet<User> set=new HashSet<>();

        User u1=new User(101, "sujay@123.com");
        User u2=new User(102, "suyash@23.com");
        User u3=new User(101, "rohan@26.com");
        User u4=new User(103, "vedant@12.com");
        User u5=new User(104, "athrava@45.com");
        User u6=new User(102, "parth@70.com");

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);
        set.add(u6);

        for (User u : set) {
            System.out.println(u.getId() + " " +u.getEmail());
        }

        set.contains("suyash@23.com");
        set.removeIf(s->s.getId()==103);
        System.out.println();
        for (User u : set) {
            System.out.println(u.getId() + " " +u.getEmail());
        }
    }
}
