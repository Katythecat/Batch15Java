package class28;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveDemo {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Lava");

        words.add("Computer");
        words.add("Java");


        // it works from java 10 upward
        var name="cat";
        var c='c';
        var f=12.5;
        System.out.println(name);


        // It works from java 6 upward

        //.iterator() is a method and will return an object of type iterator
        //it has 3 method in Iterator class
        // 1. hasNext() return true or false
        // 2. iterator.next() this return the element one by one
        // 3. iterator.remove() remove the element
        Iterator<String> iterator= words.iterator();
      while(iterator.hasNext()){
            String s=iterator.next();
            if(s.endsWith("a")){

                iterator.remove();
            }
        }

        //it works from java 8 upward
        //words.removeIf(s -> s.endsWith("a"));

        System.out.println(words);
}



    }

