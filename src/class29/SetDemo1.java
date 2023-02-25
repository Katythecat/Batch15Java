package class29;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //HashSet does not allow duplicate value and doesn't maintain insertion order
        //very rare to use but good for interview
        //use for remove duplicate value in real life
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
