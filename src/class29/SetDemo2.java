package class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        //we use HastSet not on daily basic just sometimes
        //does not allow duplicate and allow insertion order
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        //LinkedHashSet fruit=new LinkedHashSet();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("apple");
        fruit.add(null);// allow one null not multiple
        fruit.add(null);
        fruit.add(null);
        /*fruit.add(3);
        fruit.add(false);
        fruit.add('c');*/




        System.out.println(fruit);
    }
}
