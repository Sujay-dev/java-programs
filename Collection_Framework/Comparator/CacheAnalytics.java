package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CacheEntry {
    private String key;
    private int hitCount;
    private int sizeInKB;

    CacheEntry(String key,int hitCount,int sizeInKB){
        this.key=key;
        this.hitCount=hitCount;
        this.sizeInKB=sizeInKB;
    }
    public String getKey(){
        return key;
    }
    public int getHitCount(){
        return hitCount;
    }
    public int getSizeInKB(){
        return sizeInKB;
    }
}
public class CacheAnalytics {
    public static void main(String[] args) {
        List<CacheEntry> list=new ArrayList<>();

        CacheEntry c1=new CacheEntry("userProfile::99", 150, 25);
        CacheEntry c2=new CacheEntry("userProfile::32", 500, 50);
        CacheEntry c3=new CacheEntry("userProfile::45", 750, 70);
        CacheEntry c4=new CacheEntry("userProfile::69", 430, 45);
        CacheEntry c5=new CacheEntry("userProfile::14", 215, 15);

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        list.sort(Comparator.comparing(CacheEntry :: getHitCount).reversed().thenComparing(CacheEntry :: getSizeInKB).thenComparing(CacheEntry :: getKey));

        for(int i=0; i<list.size(); i++){
            System.out.println("Key: " + list.get(i).getKey() + " HitCount: " + list.get(i).getHitCount() + " SizeInKB: " + list.get(i).getSizeInKB() + "KB");
        }
    }
}
