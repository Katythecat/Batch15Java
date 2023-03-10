package Repo.R201_220;

import java.util.HashMap;

public class R207 {
    public static void main(String[] args) {
        var map = new HashMap<String, String>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Replace : ");
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var get = iterator.next();
            System.out.println(get.getKey() + " : " + get.getValue());
        }
            System.out.println("-------------");
            System.out.println("HashMap After Replace : ");

        /*var iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            var value = iter.next();
            if (value.getKey().equals("THREE")) {
                value.setValue("ASEL");
            }
            if (value.getKey().equals("FIVE")) {
                value.setValue("SUMAIR");
            }
        }*/
        /*iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var get = iterator.next();
            System.out.println(get.getKey() + " : " + get.getValue());
        }*/

        for(var get:map.entrySet()){
            if(get.getKey().equals("FIVE")){
                get.setValue("SUMAIR");
            }
            if(get.getKey().equals("THREE")){
                get.setValue("ASEL");
            }
            System.out.println(get.getKey()+" : "+get.getValue());
        }
    }
}





