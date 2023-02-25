package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TaskClass2 {
    /*
    Create a Set collection in which you need to add names of the countries.
    In this set we want all objects to be sorted in alphabetical order.
     Using 2 different ways retrieve all elements from set.
     */
    public static void main(String[] args) {
        //we use tree set bc it sorting data
        TreeSet<String>countries=new TreeSet<>();
        countries.add("Thailand");
        countries.add("Brazil");
        countries.add("France");
        countries.add("Italy");
        countries.add("China");


        System.out.println(countries);

        for (String country : countries) {
            System.out.println(country);

        }
        }
    }

