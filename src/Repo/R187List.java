package Repo;

import java.util.ArrayList;
import java.util.Iterator;

public class R187List {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("hi");
        str.add("yo");
        str.add("sup");
        str.add("yolo");
        str.add("boop");



        Iterator<String>iter=str.iterator();
        int index=0;
        while(iter.hasNext()){
            iter.next();
            if(index==0 || index==2 || index==4){
                iter.remove();
            }
            index++;
        }
        for(String s:str){

            System.out.print(s+" ");
        }
    }
}
