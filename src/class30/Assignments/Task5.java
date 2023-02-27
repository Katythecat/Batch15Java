package class30.Assignments;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
         */

        List<Integer> numbers=new ArrayList<>();
        numbers.add(15);
        numbers.add(15);
        numbers.add(25);
        numbers.add(4);
        numbers.add(23);
        numbers.add(18);
        int sum=0;
        for(Integer n:numbers){
            sum+=n;
        }
        System.out.println(sum);
    }
}
