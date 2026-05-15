package OOPS.Inheritance;

import java.util.Scanner;

class Shaped {
    Shaped(){}
    public void display(){
        System.out.println("Displaying shape ");
    }
}

class Rect extends Shaped{
    private int length;
    private int breadth;
    
    Rect(int length,int breadth){
        setValues(length, breadth);
    }

    public void setValues(int length,int breadth){
        if (length>0 && breadth>0) {
            this.length=length;
            this.breadth=breadth;
        }else{
            this.length=0;
            this.breadth=0;
        }
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Area : "+(length*breadth));
    }
}

class Circle extends Shaped{
    private int radius;
     
    Circle(int radius){
        setValue(radius);
    }

    public void setValue(int radius){
        if (radius>0) {
            this.radius=radius;
        }else{
            this.radius=0;
        }
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Area : "+ (3.14*(radius*radius)));
    }
}
public class Shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int radius=sc.nextInt();

        Rect rect=new Rect(length,breadth);
        rect.display();

        Circle circle=new Circle(radius);
        circle.display();
        sc.close();
    }
}
