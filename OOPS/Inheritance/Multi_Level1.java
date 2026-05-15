package OOPS.Inheritance;

import java.util.Scanner;

class Man {
    private String name;
    private int age;
    
    Man(String name, int age){
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

    public void displayMan(){
        System.out.println("Name : "+getName());
        System.out.println("Age : "+ getAge());
    }
}

class Worker extends Man{
    private int salary;

    Worker(String name, int age, int salary){
        super(name, age);
        setSalary(salary);
    }

    public void setSalary(int salary){
        if (salary>0) {
            this.salary=salary;
        }else{
            this.salary=0;
        }
    }

    public int getSalary(){
        return salary;
    }

    public int annualSalary(){
        return getSalary()*12;
    }

    public void displayWorker(){
        displayMan();
        System.out.println("Salary : "+ getSalary());
        System.out.println("Annual salary : "+annualSalary());
    }
}

class Developers extends Worker {
    private String language;
    private int projects;
    
    Developers(String name, int age,int salary,String language,int projects){
       super(name, age, salary);
       setLanguage(language);
       setProjects(projects);
    }

    public void setLanguage(String language){
        if (language!=null && !language.isEmpty()) {
            this.language=language;
        }else{
            this.language="Unknown";
        }
    }

    public void setProjects(int projects){
        if (projects>=0) {
            this.projects=projects;
        }else{
            this.projects=0;
        }
    }

    public void bonus(int amount){
        if (amount>0) {
        setSalary(getSalary()+amount);    
        }
    }

    public void displayDev(){
        displayWorker();
        System.out.println("Language : "+language);
        System.out.println("Projects : "+projects);
    }
}
public class Multi_Level1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int age=sc.nextInt();
        int salary=sc.nextInt();
        sc.nextLine();
        String language=sc.nextLine();
        int projects=sc.nextInt();

        Developers developers=new Developers(name, age, salary, language, projects);
        developers.bonus(10000);
        developers.displayDev();
        sc.close();
    }
}
