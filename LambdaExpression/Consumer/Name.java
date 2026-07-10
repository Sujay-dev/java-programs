package LambdaExpression.Consumer;

import java.util.function.Consumer;

public class Name {
    public static void main(String[] args) {
        Consumer<String> name=x-> System.out.println("Hello " + x);
        name.accept("Sujay");
        name.accept("Vedant");
        name.accept("Amit");
    }
}
