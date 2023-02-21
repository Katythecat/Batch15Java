package class28;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("Artem");
        names.add("Elvira");
        names.add("Safar");
        names.add("Tami");
        names.add("Sam");

        System.out.println(names);
        for(String s:names){
            System.out.println(s);
        }

    }
}
