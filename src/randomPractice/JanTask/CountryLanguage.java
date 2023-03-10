package randomPractice.JanTask;

import java.util.Scanner;

public class CountryLanguage {
    public static void main(String[] args) {
        /*
        Ask user to enter their country and capture it.
         Once values are captured print which language user speaks.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your country");
        String country = input.next();
        if (country.equalsIgnoreCase("Thailand")) {
            System.out.println(country + " speak Thai language");
        } else if (country.equalsIgnoreCase("Peru")) {
            System.out.println(country + " speak Spanish language");
        } else if (country.equalsIgnoreCase("Italy")) {
            System.out.println(country + " speak Italian language");
        } else if (country.equalsIgnoreCase("German")) {
            System.out.println(country + " speak German language");
        } else {
            System.out.println("Invalid Country");
        }
    }
}
