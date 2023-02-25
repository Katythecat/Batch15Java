package class29;

import java.util.ArrayList;

public class Task1Class28 {

    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Leo");
        names.add("Nala");
        names.add("Mama");
        names.add("Tata");
        names.add("Obama");

        System.out.println(names.isEmpty());//false
        System.out.println(names.contains("Thrump"));//false //search for specific name
        System.out.println(names.contains("Leo"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
