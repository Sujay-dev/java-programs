package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Shape {    
    abstract double area();
}

class Rectangle extends Shape {
    private int length;
    private int breadth;
    
    Rectangle(int length,int breadth){
       setValues(length, breadth);
    }

    public void setValues(int length,int breadth){
        if (length<=0 || breadth<=0) {
            this.length=0;
            this.breadth=0;
        }else{
            this.length=length;
            this.breadth=breadth;
        }
    }

    @Override
    public double area(){
       return length*breadth;
    }
}

class Circle extends Shape {
    private int radius;

    Circle(int radius){
        setRadius(radius);
    }

    public void setRadius(int radius){
        if (radius<=0) {
            this.radius=0;
        }else{
            this.radius=radius;
        }
    }

    @Override
    public double area(){
       return 3.14*radius*radius;
    }
}
public class Shape_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int radius=sc.nextInt();

        Shape s[]=new Shape[2];
        s[0]=new Rectangle(length, breadth);
        s[1]=new Circle(radius);

        for(int i=0; i<s.length; i++){
            System.out.println(s[i].area());
        }
        sc.close();
    }
}
