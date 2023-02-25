package class29;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        //Map allow us to store 2 value at a time --> key and value
        // we do not have index but key acc like an index
        //when we see hash it doesn't support insertion order
        //LinkedHashSet
        TreeMap<String, Integer> groceries=new TreeMap<>();
        //HashMap<String, Integer> groceries=new HashMap<>();
        groceries.put("Eggs",10);
        groceries.put("Milk",5);
        groceries.put("Bread",7);
        groceries.put("Chicken",13);
        groceries.put("Yogurt",5);
        groceries.put("Rice",15);
        groceries.put("Shrimp",20);

        System.out.println(groceries.get("Rice"));//15
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        groceries.remove("Chicken");
        System.out.println(groceries);






    }
}
