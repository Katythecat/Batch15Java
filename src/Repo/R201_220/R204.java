package Repo.R201_220;

import java.util.*;

public class R204 {
    public static void main(String[] args) {
        Map<String,String> map=new LinkedHashMap<>();
        map.put("Street" , "Patrick ST");
        map.put("Suite" , "265");
        map.put("City" , "Vienna");
        map.put("Zip" , "22180");
        map.put("Country" , "United State");

        Collection<String> value=  map.values();
        Iterator<String> iter=value.iterator();
        while(iter.hasNext()){
            String v=iter.next();
            System.out.println(v);
        }



    }
}
