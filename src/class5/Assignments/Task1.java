package class5.Assignments;

import java.util.Scanner;

public class Task1 {
   /*
    1) Prompt the user to enter person heights in inches.
    Person should be classified as one of the following:
            • short (under 60 inch)
            • medium(between 60 -72 inch)
            • tall (over 72 inch)*/

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your height");
        double height=input.nextDouble();

        if(height<60){
            System.out.println("You are shot");
        }else if(height>=60&&height<=72){
            System.out.println("You are medium");
        }else{
            System.out.println("You are tall");
        }

        }
    }

