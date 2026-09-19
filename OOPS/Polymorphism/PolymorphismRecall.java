package Revision_2;

class AnimalRe{
    public void  sound(){
        System.out.println("Animal Sound");
    }
}
class DogRe extends AnimalRe{
    @Override 
    public  void  sound(){
        System.out.println("Dog Barks");
    }
}
class CatRe extends AnimalRe{
    @Override 
    public  void sound(){
        System.out.println("Meow");
    }
}
public class PolymorphismRecall {
    public static void main(String[] args) {
        AnimalRe a[]=new AnimalRe[3];
        a[0]=new DogRe();
        a[1]=new CatRe();
        a[2]=new AnimalRe();

        for(int i=0; i<a.length; i++){
            a[i].sound();
        }
    }
}
