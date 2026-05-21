package OOPS.Abstract_Class;

import java.util.Scanner;

abstract class Downloader {

    public boolean isValid(int size){
        return size > 0;
    }

    abstract String download(int size);
}

class ImageDownload extends Downloader {
    @Override
    public String download(int size){
        if (!isValid(size)) {
            return "Image: Invalid file";
        }

        int speed=size/2;

        return "Image: Downloaded in "+ speed + " sec";
    }    
}

class VideoDownload extends Downloader {
    @Override
    public String download(int size){
        if (!isValid(size)) {
            return "Video: Invalid file";
        }

        int speed=size/5;
        
        return "Video: Downloaded in "+ speed + " sec";
    }    
}

class DocumentDownload extends Downloader {
    @Override
    public String download(int size){
        if (!isValid(size)) {
            return "Document: Invalid file";
        }

        int speed=size;

         return "Document: Downloaded in "+ speed + " sec";
    }    
}
public class DownLoaderTypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        Downloader d[]=new Downloader[3];
        d[0]=new ImageDownload();
        d[1]=new VideoDownload();
        d[2]=new DocumentDownload();

        for(int i=0; i<d.length; i++){
            System.out.println(d[i].download(size));
        }
        sc.close();
    }
}
