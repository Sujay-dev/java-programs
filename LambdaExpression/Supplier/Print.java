package LambdaExpression.Supplier;

import java.util.function.Supplier;

public class Print {
    public static void main(String[] args) {
        Supplier<String> print=() -> "Welcome to Java Backend";
        System.out.println(print.get());
    }
}
