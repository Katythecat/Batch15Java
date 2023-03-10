package Repo.R201_220;


import java.util.*;


public class R203 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);


        Iterator<Map.Entry<String,Integer>> entrySet=map.entrySet().iterator();

        while(entrySet.hasNext()){
            Map.Entry<String,Integer> key=entrySet.next();
            System.out.println("Key = "+key.getKey()+" and value = "+key.getValue() );
        }

        var iter=map.entrySet().iterator();
        while(iter.hasNext()) {
            var key = iter.next();
            System.out.println("Key = " + key.getKey() + " and value = " + key.getValue());


        }


    }
}
