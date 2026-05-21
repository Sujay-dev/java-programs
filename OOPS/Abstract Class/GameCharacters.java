package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Character {
    abstract int attack();
    abstract int defence(); 
    abstract String getType();
}

class Warrior extends Character{

    @Override
    public String getType(){
        return "Warrior";
    }

    @Override
    public int attack(){
        return 100;
    }    

    @Override
    public int defence(){
        return 70;
    }
}

class Mage extends Character {

    @Override
    public String getType(){
        return "Mage";
    }
    
     @Override
    public int attack(){
        return 70;
    }    

    @Override
    public int defence(){
        return 30;
    }    
}

class Archer extends Character {

    @Override
    public String getType(){
        return "Archer";
    }
    
     @Override
    public int attack(){
        return 60;
    }    

    @Override
    public int defence(){
        return 60;
    }
}
public class GameCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Character c[]=new Character[3];
        c[0]=new Warrior();
        c[1]=new Mage();
        c[2]=new Archer();

        for(int i=0; i<c.length; i++){
            System.out.println(c[i].getType() + ":" + " Attack = " + c[i].attack() + "," + " Defense = " + c[i].defence());
        }
        sc.close();
    }
}
