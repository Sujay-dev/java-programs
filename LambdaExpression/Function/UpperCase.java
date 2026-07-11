package LambdaExpression.Function;

import java.util.function.Function;

public class UpperCase {
    public static void main(String[] args) {
        Function<String,String> upper=x-> x.toUpperCase();

        System.out.println(upper.apply("java"));
        System.out.println(upper.apply("spring"));
        System.out.println(upper.apply("sql"));
    }
}
