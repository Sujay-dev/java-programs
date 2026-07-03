package Queues.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistoryEx {
    public static void main(String[] args) {
        Deque<String> history=new ArrayDeque<>();

        history.offer("google.com");
        history.offer("github.com");
        history.offer("youtube.com");
        history.offer("chat.openai.com");
        history.offer("leetcode.com");
        history.offer("claudeai.com");

        System.out.println("History: ");
        for (String s : history) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Pressed back button twice");

        String first=history.pollLast();
        String second=history.pollLast();

        System.out.println("Going back from: " + first);
        System.out.println("Going back from: " + second);

        System.out.println();

        System.out.println("Current Page: " + history.getLast());

        String visit="superset.com";
        System.out.println("Visited another page");
        history.offerLast(visit);

        System.out.println();

        System.out.println("Final History: ");
        for (String s : history) {
            System.out.println(s);
        }
    }
}
