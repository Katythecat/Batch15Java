package day5Assignments;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        4)Write a program for user to enter his/hers birth month. Based on the month define the season.
        Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month start with upper case");
        String month = input.next();
        String season;

        if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("June")) {
            season = "Spring";
        } else if (month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("September")) {
            season ="Summer";
        } else if (month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December")) {
            season = "Fall";
        } else if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("March")) {
            season = "Winter";
        } else {
            season="Invalid month";
        }
        System.out.println("You were born in "+season);
    }

}