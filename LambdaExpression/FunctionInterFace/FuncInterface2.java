package LambdaExpression.FunctionInterface;

interface Greet {
    void greet(String s);    
}
public class FuncInterface2 {
    public static void main(String[] args) {
         Greet g=a->System.out.println(a);
        g.greet("Welcome Sujay");
    }
}
