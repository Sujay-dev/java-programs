package LambdaExpression.Predicate;

import java.util.function.Predicate;

class Person{
    int age;
    int salary;

    Person(int age,int salary){
        this.age=age;
        this.salary=salary;
    }

    int getAge(){
        return age;
    }

    int getSalary(){
        return salary;
    }
}
public class Eligible {
    public static void main(String[] args) {
        Predicate<Person> age=x-> x.getAge()>=18;
        Predicate<Person> salary=x-> x.getSalary()>=30000;

        Predicate<Person> eligible=age.and(salary);

        Person p=new Person(19, 30000);
        System.out.println("Eligible for Loan: " + eligible.test(p));
    }
}
