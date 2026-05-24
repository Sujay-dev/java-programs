package OOPS.Interface;

import java.util.Scanner;

interface Login {
    boolean login(String user,String password);  
    String getType();  
}

class UserLogin implements Login {
    public boolean login(String user,String password){
        if (password.length()>5  && "user".equals(user)) {
            return true;
        }
        return false;
    }    

    public String getType(){
        return "User";
    }
}

class AdminLogin implements Login {
    public boolean login(String user,String password){
        if ("admin".equals(user) && password.equals("admin@123")) {
            return true;
        }
        return false;
    }   
    
    public String getType(){
        return "Admin";
    }
}

class GuestLogin implements Login {
    public boolean login(String user,String password){
        if (user.equalsIgnoreCase("guest")) {
        return true;
    }
    return false;    
}

    public String getType(){
        return "Guest";
    }
}
public class Login_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String user=sc.nextLine();
        String password=sc.nextLine();
       
        if(user == null || user.isEmpty()){
         System.out.println("Invalid username");
          sc.close();
           return;
         }
        Login l[]=new Login[3];
        l[0]=new AdminLogin();
        l[1]=new UserLogin();
        l[2]=new GuestLogin();

       boolean isLoggedIn = false;

        for(int i = 0; i < l.length; i++){
            if(l[i].login(user, password)){
             System.out.println(l[i].getType() + " Login Success");
              isLoggedIn = true;
               break;
            }
        }

         if(!isLoggedIn){
          System.out.println("Invalid Login");
        }
       
        sc.close();
    }
}
