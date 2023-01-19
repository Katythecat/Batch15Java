package ProjectFirst;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        2)Using Scanner create an array of countries.
        When an array is created, retrieve all values from it
        and while retrieving those values print capital for each country.
         (use 2 different loops).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 countries");
        String[] countries = new String[5];

        for (int i = 0; i < countries.length; i++) {
            countries[i] = scanner.next();
        }
        System.out.println(Arrays.toString(countries));


        for (int i = 0; i <countries.length ; i++) {
            System.out.println("The ");

        }






        System.out.println("Please enter 5 capital city of the country");
        String[] capital = new String[5];
        for (int j = 0; j < capital.length; j++) {
            capital[j] = scanner.next();
        }

        System.out.println(Arrays.toString(capital));
      //  System.out.println("The capital of" + countries[i] + "is" + capital[j]);
       // for (int i = 0; i < countries.length; i++) {
          //  for (int j = 0; j < capital.length; j++) {

            }

        }



