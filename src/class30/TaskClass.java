package class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TaskClass {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        Map<String, String> countries=new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("China","Beijing");
        countries.put("France","Paris");
        countries.put("Italy","Rome");
        countries.put("Japan","Tokyo");
        countries.put("Peru","Lima");

        //longer way
        //Set<Map.Entry<String,String>> entrySet=countries.entrySet();
        var entrySet=countries.entrySet();//var introduce in java 10
        for(var entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        var iterator=countries.entrySet().iterator();
        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }





    }
}
