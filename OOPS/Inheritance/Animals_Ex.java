package OOPS.Inheritance;

import java.util.Scanner;

class Animal {
    private String name;
    private int age;

    Animal(String name, int age){
        setName(name);
        setAge(age);
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

    public void setAge(int age){
        if (age>0) {
            this.age=age;
        }else{
            this.age=0;
        }
    }

    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println("Animal eats food.");
    }

    public void sleep(){
        System.out.println("Animal is sleeping.");
    }

    public void displayAnimal(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        eat();
        sleep();
    }
}

class Dog extends Animal {
    private String breed;

    Dog(String name, int age,String breed){
        super(name, age);
        setBreed(breed);
    }

    public void setBreed(String breed){
        if (breed!=null && !breed.isEmpty()) {
            this.breed=breed;
        }else{
            this.breed="Unknown";
        }
    }

    public String getBreed(){
        return breed;
    }

    public void bark(){
        System.out.println("Dog can bark.");
    }

    public void displayDog(){
        displayAnimal();
        System.out.println("Breed : "+getBreed());
        bark();
    }
}
public class Animals_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String breed=sc.nextLine();

        Dog dog=new Dog(name, age, breed);
        dog.displayDog();
        sc.close();
    }
}
