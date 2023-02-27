package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {
        Map<Integer, String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Leo");
        studentsMap.put(2,"Tami");
        studentsMap.put(3,"Sam");
        studentsMap.put(4,"Abeera");
        studentsMap.put(5,"Leo");
        studentsMap.put(6,"Nala");
        studentsMap.put(7,"Saba");

        //why we use Collection?
        // for get the value dev decide to go with collection please remember
        Collection<String> value=studentsMap.values();//.values() to retrieve all values
        System.out.println(value);//retrieve all the values

        //remove all the value that contain letter i
        value.removeIf(x->x.contains("i"));
        System.out.println(value);


    }
}
