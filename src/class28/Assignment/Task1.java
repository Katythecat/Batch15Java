package class28.Assignment;

import java.util.ArrayList;

public class Task1 {
    /*

     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Leo");
        names.add("Nala");
        names.add("Wednesday");
        names.add("Emily");
        names.add("Yang");
        //Array is empty or not
        System.out.println(names.isEmpty());

        //Specific name is present in ArrayList or not
        System.out.println(names.contains("Meredith"));

        //Size and print all values
        System.out.println(names.size());
        for(String name:names){
            System.out.println(name);
        }



    }
}

