package LambdaExpression.Supplier;

import java.util.function.Supplier;

public class OtpEx {
    public static void main(String[] args) {
        Supplier<Integer> otp=()-> (int) (Math.random()*9000)+1000;
        System.out.println("OTP: " + otp.get());
        System.out.println("OTP: " + otp.get());
        System.out.println("OTP: " + otp.get());
        System.out.println("OTP: " + otp.get());
        System.out.println("OTP: " + otp.get());
    }
    
}