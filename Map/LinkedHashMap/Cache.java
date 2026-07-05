package Revision;

import java.util.LinkedHashMap;

public class Cache {
    public static void main(String[] args) {
        LinkedHashMap<String,String> map=new LinkedHashMap<>();

        map.put("google.com", "Google");
        map.put("youtube.com", "Youtube");
        map.put("github.com", "GitHub");
        map.put("claudeai.com", "Claude AI");
        map.put("leetcode.com", "LeetCode");

        for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
        System.out.println();
        System.out.println("Revisited Page");
        map.replace("youtube.com", "Youtube Studio");

        
        System.out.println();
       for (var s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
