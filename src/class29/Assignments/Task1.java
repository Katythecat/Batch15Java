package class29.Assignments;

import java.util.LinkedHashSet;

public class Task1 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("Miami");
        cities.add("Austin");
        cities.add("Boston");
        cities.add("Apollo Beach");
        cities.add("San Jose");
        cities.add("Chicago");


        cities.removeIf(city -> city.startsWith("A"));
        System.out.println(cities);
        }
    }

