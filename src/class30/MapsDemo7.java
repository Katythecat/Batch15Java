package class30;

import java.util.HashMap;
import java.util.Map;

import java.util.Set;

public class MapsDemo7 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Leo");
        studentsMap.put(6,"Nala");
        studentsMap.put(7,"Saba");

        //entrySet() is a method that give us a set and that set contain an obj of Entry class

        Set<Map.Entry<Integer,String>> entrySet=studentsMap.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(entrySet);





    }
}
