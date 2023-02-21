package class28.Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Banana");
        words.add("Grape");
        words.add("Strawberry");
        words.add("Cherry");
        words.add("Orange");

        // Approach 1
        Iterator<String> iterator=words.iterator();
        while(iterator.hasNext()){
            String s=iterator.next();
            if(s.endsWith("e")){
                iterator.remove();
            }
        }

        // Approach 2
        words.removeIf(w -> w.endsWith("e"));
        System.out.println(words);

    }
}
