package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList();
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daria"));
        System.out.println(names);
        names.remove("Sam");
        System.out.println(names);
        names.add("Slava");
        System.out.println(names);

        names.add(4,"Sahara");// add by specific index
        System.out.println(names);

        names.set(6,"Tami");//for replace
        System.out.println(names);

        System.out.println(names.indexOf("Abeera"));//5






    }
}
