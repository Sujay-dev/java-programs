package Revision;

import java.util.ArrayDeque;
import java.util.Deque;

class WebPage{
    private String title;
    private String url;

    WebPage(String title,String url){
        this.title=title;
        this.url=url;
    }
    public String getTitle(){
        return title;
    }
    public String getUrl(){
        return url;
    }
}
public class WebPagesEx {
    public static void main(String[] args) {
        Deque<WebPage> dq=new ArrayDeque<>();

        dq.offer(new WebPage("Google", "google.com"));
        dq.offer(new WebPage("Youtube", "youtube.com"));
        dq.offer(new WebPage("Github", "github.com"));
        dq.offer(new WebPage("Leetcode", "leetcode.com"));
        dq.offer(new WebPage("Claudeai", "claudeai.com"));

        System.out.println("History: ");
        for (WebPage w : dq) {
            System.out.println(w.getTitle() + " " + w.getUrl());
        }

        System.out.println();
        System.out.println("Pressed Back twice...");
        dq.pollLast();
        dq.pollLast();
        System.out.println();
        System.out.println("Visited New page....");
        dq.offerLast(new WebPage("Gemini", "googlegemini.com"));

        System.out.println();
        WebPage current=dq.getLast();
        System.out.println("Current Page: " + current.getTitle() + " " + current.getUrl());

        System.out.println();
         System.out.println("History: ");
        for (WebPage w : dq) {
            System.out.println(w.getTitle() + " " + w.getUrl());
        }
    }
}
