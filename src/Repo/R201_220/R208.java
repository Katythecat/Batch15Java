package Repo.R201_220;

import java.util.HashMap;
import java.util.Map;

public class R208 {
    void display(Map<String,Integer> map){
        if(map.isEmpty()){
            System.out.println("map is empty");
        }else{
            for(var entry:map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        var map=new HashMap<String,Integer>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        R208 r=new R208();
        r.display(map);
        map.clear();
        r.display(map);


    }



}
