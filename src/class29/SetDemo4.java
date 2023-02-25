package class29;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        //insert from descending data
        TreeSet<Integer> fruit=new TreeSet<>();
        fruit.add(50);
        fruit.add(40);
        fruit.add(100);
        fruit.add(20);
        fruit.add(35);
        fruit.add(50);

        System.out.println(fruit);
    }
}
