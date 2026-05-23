<<<<<<< HEAD
package OOPS.Interface;

import java.util.Scanner;

interface Bonus {
    String calculateBonus(int salary);    
}

class Manager implements Bonus {
    public String calculateBonus(int salary){
        int bonus=(salary*20)/100;
        return "Manager Bonus: " + bonus;
    }    
}

class Developer implements Bonus {
    public String calculateBonus(int salary){
        int bonus=(salary*10)/100;
        return "Developer Bonus: " + bonus;
    }    
}

class Intern implements Bonus {
    public String calculateBonus(int salary){
        int bonus=(salary*5)/100;
        return "Intern Bonus: " + bonus;
    }    
}
public class Bonus_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int salary=sc.nextInt();

        Bonus b[]=new Bonus[3];
        b[0]=new Manager();
        b[1]=new Developer();
        b[2]=new Intern();

        for(int i=0; i<b.length; i++){
            System.out.println(b[i].calculateBonus(salary));
        }
        sc.close();
    }
}
=======
package OOPS.Interface;

import java.util.Scanner;

interface Bonus {
    String calculateBonus(int salary);    
}

class Manager implements Bonus {
    public String calculateBonus(int salary){
        int bonus=(salary*20)/100;
        return "Manager Bonus: " + bonus;
    }    
}

class Developer implements Bonus {
    public String calculateBonus(int salary){
        int bonus=(salary*10)/100;
        return "Developer Bonus: " + bonus;
    }    
}

class Intern implements Bonus {
    public String calculateBonus(int salary){
        int bonus=(salary*5)/100;
        return "Intern Bonus: " + bonus;
    }    
}
public class Bonus_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int salary=sc.nextInt();

        Bonus b[]=new Bonus[3];
        b[0]=new Manager();
        b[1]=new Developer();
        b[2]=new Intern();

        for(int i=0; i<b.length; i++){
            System.out.println(b[i].calculateBonus(salary));
        }
        sc.close();
    }
}
>>>>>>> a86436e2a880c3a8aa8349cb1b244a86f0bf53b3
