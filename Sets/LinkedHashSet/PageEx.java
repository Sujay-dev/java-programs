package Revision;

import java.util.LinkedHashSet;

class Page{
    private String title;
    private String url;

    Page(String title,String url){
        this.title=title;
        this.url=url;
    }
    public String getTitle(){
        return title;
    }
    public String getUrl(){
        return url;
    }
    @Override 
    public boolean equals(Object obj){
        if(!(obj instanceof Page)) return false;
        Page other=(Page) obj;
        return this.url.equals(other.url);
    }
    @Override 
    public int hashCode(){
        return this.url.hashCode();
    }
}
public class PageEx {
    public static void main(String[] args) {
        LinkedHashSet<Page> set=new LinkedHashSet<>();

        set.add(new Page("Youtube", "youtube.com"));
        set.add(new Page("Google", "google.com"));
        set.add(new Page("Github", "github.com"));
        set.add(new Page("LeetCode", "google.com"));
        set.add(new Page("ClaudeAi", "claudeai.com"));

        System.out.println("History: ");
        for (Page p : set) {
            System.out.println(p.getTitle() + " " +p.getUrl());
        }
    }
}
