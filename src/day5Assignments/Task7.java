package day5Assignments;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        7) Ask user to enter their country and capture it.
         Once values are captured print which language user speaks.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=input.next();

        String language="English";
        String language1="Russian";
        String language2="Spanish";
        String language3="German";
        String language4="French";

        if(country.equals("Peru")){
            System.out.println("You speak:"+language2);
        }else if(country.equals("Belarus")){
            System.out.println("You speak:"+language1);
        }else if(country.equals("German")){
            System.out.println("You speak:"+language3);
        }else if(country.equals("England")){
            System.out.println("You speak:"+language);
        }else if(country.equals("France")){
            System.out.println("You speak:"+language4);
        }else{
            System.out.println("Invalid country");
        }
    }
}
