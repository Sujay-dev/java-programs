package LambdaExpression.Predicate;

import java.util.function.Predicate;

public class Even {
    public static void main(String[] args) {
        Predicate<Integer> test=x-> x%2==0;

        System.out.println(test.test(10));
        System.out.println(test.test(15));
        System.out.println(test.test(22));
        System.out.println(test.test(37));
        System.out.println(test.test(40));

    }
}
