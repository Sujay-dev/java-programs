package OOPS.Inheritance;

import java.util.Scanner;

class Shape {
    private String color;

    Shape(String color){
        setColor(color);
    }
    public void setColor(String color){
        if (color!=null && !color.isEmpty()) {
            this.color=color;
        }else{
            this.color="Unknown";
        }
    }

    public String getColor(){
        return color;
    }

    public void displayShape(){
        System.out.println("Color : "+getColor());
    }
}

class Rectangle extends Shape{
    private int length;
    private int width;

    Rectangle(String color,int length,int width){
        super(color);
        setValues(length, width);
    }
    public void setValues(int length,int width){
        if (length > 0 && width > 0) {
            this.length=length;
            this.width=width;
        }else{
            this.length=0;
            this.width=0;
        }
    }

    public int area(){
        return length*width;
    }

    public int perimeter(){
        return 2*(length+width);
    }

    public void displayRectangle(){
        displayShape();
        System.out.println("Area : "+area());
        System.out.println("Perimeter : "+perimeter());
    }
}
public class Shape_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String color=sc.nextLine();
        int l=sc.nextInt();
        int w=sc.nextInt();

        Rectangle rectangle=new Rectangle(color, l, w);
        rectangle.displayRectangle();
        sc.close();
    }
}
