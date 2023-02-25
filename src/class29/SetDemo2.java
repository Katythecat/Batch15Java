package class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        //we use HastSet not on daily basic just sometimes
        //does not allow duplicate and allow insertion order
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("apple");

        System.out.println(fruit);
    }
}
