package LambdaExpression.Function;

import java.util.function.Function;

public class FuncChaning {
    public static void main(String[] args) {
        Function<String,String> upper=x-> x.toUpperCase();
        Function<String,String> add=x-> x+"Developer";

        Function<String,String> output=upper.andThen(add);

        System.out.println(output.apply("java "));
    }
}
