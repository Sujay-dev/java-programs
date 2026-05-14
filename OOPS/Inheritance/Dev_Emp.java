package OOPS.Inheritance;

import java.util.Scanner;

class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary){
        setName(name);
        setSalary(salary);
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

    public void displayEmp(){
        System.out.println("Name : "+getName());
        System.out.println("Salary : "+getSalary());
    }
}

class Developer extends Employee {
    private String programminglang;
    private int projects;

    Developer(String name,int salary,String programminglang,int projects){
        super(name, salary);
        setLang(programminglang);
        setProjects(projects);
    }

    public void setLang(String lang){
        if (lang!=null && !lang.isEmpty()) {
            this.programminglang=lang;
        }else{
            this.programminglang="Unknown";
        }
    }

    public String getLang(){
        return programminglang;
    }

    public void setProjects(int projects){
        if (projects>0) {
            this.projects=projects;
        }else{
            this.projects=0;
        }
    }

    public int getProjects(){
        return projects;
    }

    public void bonus(int amount){
        setSalary(getSalary()+amount);
    }

    public void displayDeveloper(){
        displayEmp();
        System.out.println("Programming Language : "+getLang());
        System.out.println("Projects Completed : "+getProjects());
    }
}
public class Dev_Emp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int salary=sc.nextInt();
        sc.nextLine();
        String lang=sc.nextLine();
        int projects=sc.nextInt();

        Developer dev=new Developer(name, salary, lang, projects);
        dev.bonus(10000);
        dev.displayDeveloper();
        sc.close();
    }
}
