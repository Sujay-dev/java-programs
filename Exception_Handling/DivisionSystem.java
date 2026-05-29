package Exeption_Handling;

public class DivisionSystem {
    public static void main(String[] args) {

        int n[] = {100, 200, 300, 400};
        int d[] = {1, 2, 0, 4};

        for(int i = 0; i < n.length; i++){
            try{
                System.out.println(divide(n[i], d[i]));
            } catch(ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Program continues...");
    }

    public static int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
