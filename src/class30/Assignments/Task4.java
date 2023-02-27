package class30.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;


public class Task4 {
    public static void main(String[] args) {
        /*
Create the collection that will store single uniques Objects of
 a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
         */
        Set<String> strings=new LinkedHashSet<>();
        strings.add("I");
        strings.add("want");
        strings.add("to");
        strings.add("sleep");
        strings.add("all day");
        strings.add("all night");

        for(String s:strings){
            System.out.print(s+" ");
        }
    }
}
