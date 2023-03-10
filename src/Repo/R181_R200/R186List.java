package Repo.R181_R200;

import java.util.ArrayList;
import java.util.Iterator;

public class R186List {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.add(111);
        number.add(222);
        number.add(333);
        number.add(444);
        number.add(555);
        number.add(666);

        System.out.println(number);
        Iterator<Integer>iter=number.iterator();
        while(iter.hasNext()){
            Integer num=iter.next();
            iter.remove();
        }
        System.out.println(number);


        number.removeIf(n -> n != 0);
        System.out.println(number);

    }
}
