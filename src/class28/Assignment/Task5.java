package class28.Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 2; i <= 500; i+=2) {
            if(i%2==0){
                numbers.add(i);
            }
        }
       /*Iterator<Integer> iterator=numbers.iterator();
        while(iterator.hasNext()){
            Integer i=iterator.next();
            if(i%5==0){
                iterator.remove();
            }
        }*/

        numbers.removeIf(i -> (i%5==0));

        System.out.print(numbers+" ");
        }
    }

