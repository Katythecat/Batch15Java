package RandomPractice;

import java.util.Scanner;

public class City {
    public static void main(String[] args) {
         /*
        2)Using Scanner create an array of countries.
        When an array is created, retrieve all values from it
        and while retrieving those values print capital for each country.
         (use 2 different loops).
         */


        Scanner scanner = new Scanner(System.in);
        String[] countries = new String[5];

        for (int i = 0; i < countries.length; i++) {

            System.out.println("Please enter countries");
            countries[i] = scanner.next();
            System.out.println("Please enter its capital city");
            String capitals = scanner.next();
            System.out.println("The capital city of " + countries[i] + " is " + capitals);
        }

        /*String[][] countries=new String[2][2];
        System.out.println("Please enter 5 countries and its capital city");

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                countries[i][j] = scanner.nextLine();
            }
        }
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
              System.out.print(countries[i][j] + " ");
               // System.out.println("The capital city of "+countries[i][j]);
                //System.out.println("The capital city of "+countries[0][0]+countries[0][0]);
                //System.out.println("The capital city of "+countries[i].toString()+"is"+countries[j].toString());
            }

            System.out.println();
        }*/


            /*System.out.println("----------");
            for(String[] x:countries){
                for(String country:x){
                    System.out.print(country+" ");
                }
                System.out.println();
            }*/
    }
}
