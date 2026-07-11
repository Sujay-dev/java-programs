package LambdaExpression.Function;

import java.util.function.Function;

public class ComposeEx {
    public static void main(String[] args) {
        Function<Integer,Integer> square=x-> x*x;
        Function<Integer,Integer> add=x-> x+10;

        Integer result=square.compose(add).apply(5);
        System.out.println(result);
    }
}
