package randomPractice.JanTask;

import java.util.Scanner;

public class birthMonth {
    public static void main(String[] args) {
        /*
        Write a program for user to enter his/hers birth month.
        Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month = input.next();
        if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
            System.out.println("You were born on Spring");
        }else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println("You were born on Summer");
        } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
            System.out.println("You were born on Fall");
        }else{
            System.out.println("You were born on Winter");
        }
    }
}