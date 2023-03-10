package Repo.R201_220;

import java.util.*;
public class R2066 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Remove : ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /*Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iter = entrySet.iterator();
*/
        Iterator<Map.Entry<String,String>> iter=map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            if (entry.getKey().contains("ONE") || entry.getKey().contains("FOUR")) {
                iter.remove();
            }
        }

        System.out.println("HashMap After Remove : ");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

