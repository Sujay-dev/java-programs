package OOPS.Class_Object;

import java.util.Scanner;

class Rect {
    private int length;
    private int width;

    Rect(){
        this(1,1);
    }

    Rect(int length){
        this(length,length);
    }

    Rect(int length, int width){
        setLength(length);
        setWidth(width);
    }

    public void setLength(int length){
        if (length>0) {
            this.length=length;
        }else{
            this.length=0;
        }
    }

    public void setWidth(int width){
        if (width>0) {
            this.width=width;
        }else{
            this.width=0;
        }
    }

    public int area(){
        return length*width;
    }

    public int perimeter(){
        return (2*(length+width));
    }

}

public class Rect_Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int width=sc.nextInt();

        Rect r0=new Rect();
        System.out.println(r0.area());

        Rect r1=new Rect(length);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Rect r2=new Rect(length,width);
        System.out.println(r2.area());
        System.out.println(r2.perimeter());

        sc.close();
    }
}
