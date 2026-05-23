package OOPS.Interface;

interface FileHandler {
    boolean open();
    boolean close();
    String getType();
}

class TextFile implements FileHandler {
    int size;

    TextFile(int size){
        this.size = size;
    }

    public boolean open(){
        return size > 0 && size < 500;
    }

    public boolean close(){
        return true;
    }

    public String getType(){
        return "TextFile";
    }
}

class ImageFile implements FileHandler {
    int resolution;

    ImageFile(int resolution){
        this.resolution = resolution;
    }

    public boolean open(){
        return resolution > 0 && resolution < 4000;
    }

    public boolean close(){
        return true;
    }

    public String getType(){
        return "ImageFile";
    }
}

class VideoFile implements FileHandler {
    int duration;

    VideoFile(int duration){
        this.duration = duration;
    }

    public boolean open(){
        return duration > 0 && duration <= 10;
    }

    public boolean close(){
        return true;
    }

    public String getType(){
        return "VideoFile";
    }
}

public class File_System {
    public static void main(String[] args) {

        FileHandler[] f = new FileHandler[3];
        f[0] = new TextFile(300);
        f[1] = new ImageFile(2000);
        f[2] = new VideoFile(5);

        for(int i = 0; i < f.length; i++){
            if(f[i].open()){
                System.out.println(f[i].getType() + " opened");
                if(f[i].close()){
                    System.out.println(f[i].getType() + " closed");
                }
            } else {
                System.out.println(f[i].getType() + " cannot open");
            }
            System.out.println();
        }
    }
}