package Repo.R201_220;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Repo207 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Replace");
        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        //iterator=map.entrySet().iterator();//we declare already don't need again
        // make it like a pro Katy!!!! DO BETTER
        while(iterator.hasNext()) {

            Map.Entry<String,String> entry=iterator.next();
            if (entry.getKey().equals("FIVE")) {
                map.replace("FIVE", "SUMAIR");
            }
            if (entry.getKey().equals("THREE")) {
                map.replace("THREE", "ASEL");
            }
        }

        System.out.println("HashMap After Replace");
        //iterator=map.entrySet().iterator();//we declare already don't need again
        // make it like a pro Katy!!!! DO BETTER
        while(iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }





    }
}
