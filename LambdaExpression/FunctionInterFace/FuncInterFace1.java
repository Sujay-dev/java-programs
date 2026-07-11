package LambdaExpression.FunctionInterface;

interface Calculator {
    public int calculate(int a,int b);
}
public class FuncInterface1 {
    public static void main(String[] args) {
        Calculator c[]=new Calculator[4];

        c[0]=(a,b)->a+b;
        c[1]=(a,b)->a-b;
        c[2]=(a,b)->a*b;
        c[3]=(a,b)->a/b;

        for(int i=0; i<c.length; i++){
            System.out.println("Calculation: " + c[i].calculate(10, 20));
        }
    }
}
