package OOPS.Polymorphism;

import java.util.Scanner;

class Area {
    public void area(){

    }
}

class Rectangle extends Area { 
    private int length;
    private int breadth;
    
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override 
    public void area(){
        System.out.println(length*breadth);
    }
}

class Circle extends Area {
    private int radius;
    
    Circle(int radius){
        this.radius=radius;
    }
    @Override
    public void area(){
        System.out.println(3.14*(radius*radius));
    }
}

class Triangle extends Area {
    private int base;
    private int height;
    
    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public void area(){
        System.out.println(0.5*(base*height));
    }
}
public class Area_Ex {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         int length=sc.nextInt();
         int breadth=sc.nextInt();
         int radius=sc.nextInt();
         int base=sc.nextInt();
         int height=sc.nextInt();

         Area a[]=new Area[3];
         a[0]=new Rectangle(length,breadth);
         a[1]=new Circle(radius);
         a[2]=new Triangle(base,height);

         for(int i=0; i<a.length; i++){
            a[i].area();
         }
         sc.close();
    }
}
