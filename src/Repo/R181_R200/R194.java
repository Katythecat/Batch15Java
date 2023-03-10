package Repo.R181_R200;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class R194 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        Iterator<String> iter=countries.iterator();
        while(iter.hasNext()){
            String country= iter.next();
            if(country.startsWith("A")){
                iter.remove();
            }
        }
        System.out.println(countries);



        countries.removeIf(country->country.startsWith("A"));
        System.out.println(countries);
    }
}
