package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Leo");
        studentsMap.put(2,"Tami");
        studentsMap.put(3,"Sam");
        studentsMap.put(4,"Abeera");
        studentsMap.put(5,"Leo");
        studentsMap.put(6,"Nala");
        studentsMap.put(7,"Saba");
        //remove all the keys from this map if they are greater than 2

        

        Set<Integer> keys=studentsMap.keySet();
        keys.removeIf(k->k>2);
        System.out.println(keys);// 1 2 should be this line
        System.out.println(studentsMap);
        }



    }

