package class30.Assignments;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /*
       Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
         */

        Map<Integer,String> store=new HashMap<>();
        store.put(123456,"Printer");
        store.put(157463,"Ipad Pro");
        store.put(235871,"Apple Watch");
        store.put(217458,"Dyson Airwrap");
        store.put(251436,"Play Station 5");
        store.put(123456,"MacBook Pro");

        var entrySet=store.entrySet();
        for(var entry:entrySet){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}
