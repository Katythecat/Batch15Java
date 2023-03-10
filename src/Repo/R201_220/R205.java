package Repo.R201_220;

import java.util.*;

public class R205 {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("Street" , "Patrick ST");

        map.put("Suite" , "265");

        map.put("City" , "Vienna");

        map.put("Zip" , "22180");

        map.put("Country" , "United State");

        /*Set<Map.Entry<String,String>> values=map.entrySet();
        for(Map.Entry<String,String> entry:values){
            System.out.println(entry.getValue().toUpperCase());
        }*/

        for(Map.Entry<String,String> value: map.entrySet()){
            System.out.println(value.getValue().toUpperCase());
        }






    }
}
