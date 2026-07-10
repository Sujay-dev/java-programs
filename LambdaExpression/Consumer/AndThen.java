package LambdaExpression.Consumer;

import java.util.function.Consumer;

public class AndThen {
    public static void main(String[] args) {
        Consumer<Student> name=x-> System.out.println(x.getName());
        Consumer<Student> marks=x-> System.out.println(x.getMarks());

        Student s6=new Student(106, "Vijay", 70);

        name.andThen(marks).accept(s6);

        
    }
}
