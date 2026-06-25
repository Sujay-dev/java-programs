package Maps.Treemap;

import java.util.TreeMap;

class User{
    private int userId;
    private String userName;

    User(int id,String name){
        this.userId=id;
        this.userName=name;
    }
    public int getId(){
        return userId;
    }
    public String getName(){
        return userName;
    }
}
public class UserLoginSystem {
    public static void main(String[] args) {
        TreeMap<Integer,User>map =new TreeMap<>();

        User u1=new User(103, "Sujay");
        User u2=new User(101, "Suyash");
        User u3=new User(102, "Rohan");
        User u4=new User(104, "Vedant");

        map.put(103,u1);
        map.put(101,u2);
        map.put(102,u3);
        map.put(104,u4);

        for (var s : map.entrySet()) {
                System.out.println(s.getKey() + " " + s.getValue().getId() + " " + s.getValue().getName());
        }
        System.out.println(map.get(102).getId());
    }
}
