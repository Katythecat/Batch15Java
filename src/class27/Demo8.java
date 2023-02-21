package class27;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //add method to add elements to this arrayList
        names.add("Nelson");
        names.add("Sam");
        names.add("Diana");
        names.add("Zahra");
        names.add("Daria");
        names.add("Saba");

        System.out.println(names);
        names.set(2,"Abeera");//this will replace at the specific index now we dont have Diana we
        //have abeera instead

        System.out.println(names.get(4));//Daria
        //names.clear();
        System.out.println(names);
    }
}
