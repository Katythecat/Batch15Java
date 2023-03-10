package Repo.R181_R200;

import java.util.Iterator;
import java.util.LinkedList;

public class R189 {
    public static void main(String[] args) {
        LinkedList<Integer>number=new LinkedList<>();

        for(int i=50;i<=100;i++){
            number.add(i);
            }
        Iterator<Integer>iter=number.iterator();
        while(iter.hasNext()){
            int num=iter.next();
            if(num%3!=0){
                iter.remove();
            }
        }
        System.out.println(number);
        for(int s:number){
            System.out.print(s+" ");
        }
    }
}


