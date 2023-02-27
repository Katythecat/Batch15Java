package class30;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo9 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("China", "Beijing");
        countries.put("France", "Paris");
        countries.put("Italy", "Rome");
        countries.put("Japan", "Tokyo");
        countries.put("Peru", "Lima");


        var values=countries.values();
        for(var value:values){
            System.out.println(value);
        }

        var iterator=countries.values().iterator();
        while(iterator.hasNext()){
            var value=iterator.next();
            System.out.println(value);
        }

    }
}