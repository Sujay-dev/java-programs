package Revision;

import java.util.Scanner;

abstract class ShapeTypes{
    abstract double area();
    abstract String getType();
}

class CircleShape extends ShapeTypes{
    int radius;
    CircleShape(int radius){
        this.radius=radius;
    }
    @Override
    public double area(){
        return (Math.PI*(radius*radius));
    }

    @Override
    public String getType(){
        return "Circle";
    }
}

class RectangleShape extends ShapeTypes{
    int length;
    int breadth;

    RectangleShape(int l, int b){
        this.length=l;
        this.breadth=b;
    }

     @Override
    public double area(){
        return length*breadth;
    }

    @Override
    public String getType(){
        return "Rectangle";
    }
}

class TriangleShape extends ShapeTypes{
    int base;
    int height;

    TriangleShape(int b, int h){
        this.base=b;
        this.height=h;
    }

     @Override
    public double area(){
        return (base*height)/2.0;
    }

    @Override
    public String getType(){
        return "Triangle";
    }
}
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int radius=sc.nextInt();
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int base=sc.nextInt();
        int height=sc.nextInt();

        ShapeTypes s[]={new CircleShape(radius), new RectangleShape(length, breadth), new TriangleShape(base, height)};

        for(int i=0; i<s.length; i++){
            System.out.println(s[i].getType() + " Area: " + s[i].area());
        }
        sc.close();
    }
}
