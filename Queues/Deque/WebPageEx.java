package Revision_2;

import java.util.ArrayDeque;
import java.util.Deque;

class WebPage{
    private String url;
    private String title;

    WebPage(String url,String title){
        this.url=url;
        this.title=title;
    }
    public String getUrl(){
        return url;
    }
    public String getTitle(){
        return title;
    }
}
public class WebPageEx {
    public static void main(String[] args) {
        Deque<WebPage> dq=new ArrayDeque<>();

        WebPage w1=new WebPage("google.com", "Google");
        WebPage w2=new WebPage("youtube.com", "Youtube");
        WebPage w3=new WebPage("github.com", "Github");
        WebPage w4=new WebPage("leetcode.com", "Leetcode");
        WebPage w5=new WebPage("gemini.com", "Gemini");

        dq.offerLast(w1);
        dq.offerLast(w2);
        dq.offerLast(w3);
        dq.offerLast(w4);
        dq.offerLast(w5);

        System.out.println("History: ");
        for (WebPage w : dq) {
            System.out.println(w.getUrl() + " " + w.getTitle());
        }

        System.out.println("\nPressed back twice...");
        dq.pollLast();
        dq.pollLast();
        System.out.println("\nVisited new page...");
        WebPage w6=new WebPage("claudeai.com", "Claude Ai");
        dq.offerLast(w6);
        WebPage current=dq.peekLast();
        System.out.println("\nCurrent Page: " + current.getUrl() + " " + current.getTitle());
        System.out.println("\nVisited History: ");
        while (!dq.isEmpty()) {
            WebPage history=dq.poll();
            System.out.println(history.getUrl() + " " + history.getTitle());
        }
    }
}
