package OOPS.Interface;

import java.util.Scanner;

interface  Camera{
    String clickPhoto();    
}

interface MusicPlayer {
    String playMusic();    
}

class SmartPhone implements Camera,MusicPlayer {
    public String clickPhoto(){
        return "Photo Clicked";
    }    
    public String playMusic(){
        return "Music Playing";
    }
}
public class Multi_Interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Camera c=new SmartPhone();
        System.out.println(c.clickPhoto());
        
        MusicPlayer m=new SmartPhone();
        System.out.println(m.playMusic());
        sc.close();
    }
}
