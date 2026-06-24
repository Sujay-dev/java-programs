package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SearchResult
{
    private String title;
    private double relevance;
    private long indexedTime;
    private int clickCount;

    SearchResult(String title,double relevance,long indexedTime,int clickCount){
        this.title=title;
        this.relevance=relevance;
        this.indexedTime=indexedTime;
        this.clickCount=clickCount;
    }
    public String getTitle(){
        return title;
    }
    public double getRelevance(){
        return relevance;
    }
    public long getIndexedTime(){
        return indexedTime;
    }
    public int getClickCount(){
        return clickCount;
    }
}
public class IndependantComaparators {
    public static void main(String[] args) {
        List<SearchResult> list=new ArrayList<>();

        SearchResult s1=new SearchResult("Shoes", 10, 15, 5);
        SearchResult s2=new SearchResult("Mobile", 40, 25, 3);
        SearchResult s3=new SearchResult("T-shirt", 20, 5, 7);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Relevance Comparator");
        List<SearchResult> relevanceComaparator=new ArrayList<>(list);

        Comparator<SearchResult> RelevanceComparator=Comparator.comparingDouble(SearchResult :: getRelevance).reversed();
        relevanceComaparator.sort(RelevanceComparator);
        
        for(int i=0; i<relevanceComaparator.size(); i++){
            System.out.println("Title: " + relevanceComaparator.get(i).getTitle() + " Relevance: "  + relevanceComaparator.get(i).getRelevance() + " Index Time: " + relevanceComaparator.get(i).getIndexedTime() + " Click Count:" + relevanceComaparator.get(i).getClickCount());
        }

        List<SearchResult> freshnessComaparator=new ArrayList<>(list);

        Comparator<SearchResult> FreshnessComparator=Comparator.comparingLong(SearchResult :: getIndexedTime).reversed();
        freshnessComaparator.sort(FreshnessComparator);

        System.out.println();
         System.out.println("Freshness Comparator");
        for(int i=0; i<freshnessComaparator.size(); i++){
            System.out.println("Title: " + freshnessComaparator.get(i).getTitle() + " Relevance: "  + freshnessComaparator.get(i).getRelevance() + " Index Time: " + freshnessComaparator.get(i).getIndexedTime() + " Click Count: " + freshnessComaparator.get(i).getClickCount());
        }

        List<SearchResult> popularityComparator=new ArrayList<>(list);

        Comparator<SearchResult> PopularityComparator=Comparator.comparingInt(SearchResult :: getClickCount).reversed();
        popularityComparator.sort(PopularityComparator);

        System.out.println();
         System.out.println("Popularity Comparator");
        for(int i=0; i<popularityComparator.size(); i++){
            System.out.println("Title: " + popularityComparator.get(i).getTitle() + " Relevance: "  + popularityComparator.get(i).getRelevance() + " Index Time: " + popularityComparator.get(i).getIndexedTime() + " Click Count: " + popularityComparator.get(i).getClickCount());
        }
    }
}
