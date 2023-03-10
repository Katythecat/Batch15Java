package Repo.R181_R200;

import java.util.ArrayList;
import java.util.Iterator;

public class R184 {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.add(111);
        number.add(222);
        number.add(333);
        number.add(444);
        number.add(555);
        number.add(666);


        int[] index={0,2,4};
        for(int num:index){
            System.out.println(number.add(num));
        }
    }
}
//we do the code to fine the result first and then assign in the way of Arraylist