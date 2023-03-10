package Repo.R201_220;

import java.util.HashMap;



public class R206 {
    public static void main(String[] args) {
        var map = new HashMap<String, String>();
        map.put("ONE", "AAA");

        map.put("TWO", "BBB");

        map.put("THREE", "CCC");

        map.put("FOUR", "DDD");

        map.put("FIVE", "EEE");

        var entrySet = map.entrySet();
        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        System.out.println("HashMap Before Remove");
        var iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            var key=iterator.next();
            if(key.getKey().equals("ONE")||key.getKey().equals("FOUR")){
                iterator.remove();
            }
        }
        System.out.println("------------");
        System.out.println("HashMap After Remove");
       // var entryset = map.entrySet();
        for (var entry : map.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}


