package Repo.R201_220;

import java.util.*;

public class R2077 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("ONE","AAA");

        map.put("TWO","BBB");

        map.put("THREE","CCC");

        map.put("FOUR","DDD");

        map.put("FIVE","EEE");

        //wrong!!!! read the specification carefully they ask to use Entryset using iterator only
        //DO BETTER
        System.out.println("HashMap Before Replace : ");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        Iterator<Map.Entry<String,String>> iter=map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,String> entry= iter.next();
            if(entry.getKey().equals("FIVE")){
                entry.setValue("SUMAIR");
            }
            if(entry.getKey().equals("THREE")){
                //entry.setValue("ASEL");
                map.replace("THREE","ASEL");
            }
        }
        System.out.println("HashMap After Replace : ");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }
}
