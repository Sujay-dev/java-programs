package LambdaExpression.Predicate;

import java.util.function.Predicate;

public class StringLenght {
    public static void main(String[] args) {
        Predicate<String> length=x-> x.length()>5;
        Predicate<String> start=x->x.startsWith("S");

        Predicate<String> output=length.and(start);

        System.out.println(output.test("Java"));
        System.out.println(output.test("Spring"));
        System.out.println(output.test("Sql"));
        System.out.println(output.test("Streams"));
        System.out.println(output.test("Python"));
    }
}
