package my.project.first;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        /*
        2)Using Scanner create an array of countries.
        When an array is created, retrieve all values from it
        and while retrieving those values print capital for each country.
         (use 2 different loops).
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of countries:");
        int numberOfCountries=input.nextInt();
        String[] countries=new String[numberOfCountries];

        System.out.println("Enter countries");
        for (int i = 0; i < countries.length; i++) {
            countries[i] = input.next();
        }

        for(String country:countries){
            String capital;
            switch (country){
                case "Thailand": capital="Bkk";break;
                case "Peru": capital="Lima";break;
                case "China": capital="Beijing";break;
                case "Japan": capital="Tokyo";break;
                case "France": capital="Paris";break;
                default:capital="Unknown";
            }
            System.out.println("Capital city of "+country+" is "+capital);

        }



        }
    }




