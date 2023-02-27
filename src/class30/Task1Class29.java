package class30;

import java.util.LinkedHashSet;

public class Task1Class29 {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Miami");
        cities.add("Austin");
        cities.add("Boston");
        cities.add("Apollo Beach");
        cities.add("San Jose");
        cities.add("Chicago");

        cities.removeIf(c -> c.startsWith("A"));
        System.out.println(cities);
    }
}
