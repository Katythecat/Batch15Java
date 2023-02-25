package Repo;

import java.util.ArrayList;
import java.util.Iterator;

public class R186 {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(111);
        number.add(222);
        number.add(333);
        number.add(444);
        number.add(555);
        number.add(666);

        System.out.println(number);
        /*Iterator<Integer> iterator=number.iterator();
        while(iterator.hasNext()){
            int num=iterator.next();
            if(num>=111 && num <= 666){
                iterator.remove();
            }
        }*/

        number.removeIf(num -> num>=111 && num <= 666);

        //number.removeAll(number);

        System.out.println(number);
    }
}
