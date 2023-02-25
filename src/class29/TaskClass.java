package class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class TaskClass {
    /*
    List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
How can you remove all duplicates from ArrayList?
     */
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        LinkedHashSet<String> list=new LinkedHashSet<>(aList);
        System.out.println(list);
    }
}
