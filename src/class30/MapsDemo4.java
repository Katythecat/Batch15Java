package class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        HashMap<String , Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("Mascara",50.0);
        makeup.put("Eyeliner",12.2);
        makeup.put("Blush-on",12.2);

        //To get all the keys we can use keyset mehtod from Map interface
        //why we use Set?
        //bc key can not be duplicated and set do not allowed duplicate(can use anytype of set)
        //we cannot use Map to store this value bc this is single value but Map contain kay and value
        Set<String> allKeys=makeup.keySet();//keySet() comes from the Map interface
        System.out.println(allKeys);//get all keys

        for(String s:allKeys){
            System.out.println(s);// also retrieve all keys
        }

        // delete all the entries from the map for which the size of key is grester than 7
        allKeys.removeIf(k->k.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);









    }
}
