package Repo;

import java.util.ArrayList;
import java.util.Iterator;

public class R191 {
    public static void main(String[] args) {
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB=new ArrayList<>();
        listB.addAll(listA);



        Iterator<Boolean> iter=listB.iterator();
        while(iter.hasNext()){
            boolean b=iter.next();
                System.out.println(b);
            }
        }
    }


