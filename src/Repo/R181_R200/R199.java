package Repo.R181_R200;

import java.util.*;

public class R199 {
    public static void main(String[] args) {
        Set<String>name=new LinkedHashSet<>();
        name.add(null);
        name.add("Sohil");
        name.add("Diego");
        name.add("Alijon");
        name.add("Asel");
        name.add("Sumair");

        for(String names:name){
            System.out.println(names);
        }

        Iterator<String>names= name.iterator();
        while (names.hasNext()){
            String s=names.next();
            System.out.println(s);
        }


    }
}
