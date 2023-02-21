package class28;




import class26.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("10");
        Object a=new String("Leo");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);




        //no one now uses the arrays like this
        ArrayList name=new ArrayList();
        name.add("Tami");
        name.add(10);
        name.add('a');
       // name.add(new Dog(""));


        for(Object j:name){
            System.out.println(j);


            //this is not prefer right now


        }
    }
}
