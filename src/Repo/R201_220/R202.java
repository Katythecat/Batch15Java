package Repo.R201_220;

import class30.Entry;

import java.util.*;

public class R202 {
    public static void main(String[] args) {
        Map<String, String>items=new TreeMap<>();
        items.put("1 item","apple");
        items.put("2 item" , "banana");
        items.put("3 item" ,"pear");
        items.put("4 item" , "tomato");
        items.put("5 item" , "mango");
        items.put("6 item" , "kiwi" );
        Set<Map.Entry<String,String>> entrySet=items.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            System.out.println("Key is "+entry.getKey()+" and values is "+entry.getValue());

        }

    }
}
