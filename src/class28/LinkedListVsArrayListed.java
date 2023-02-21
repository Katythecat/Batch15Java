package class28;

import java.util.ArrayList;

public class LinkedListVsArrayListed {
    public static void main(String[] args) {

        //linkedList ==>121 ms
        //ArrayList ==> 84195 ms
        long startTime = System.currentTimeMillis();
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0, "Test data");
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);


        {

        }
    }
}
