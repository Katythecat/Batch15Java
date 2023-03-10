package randomPractice.JanTask;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        /*
       Allow user to enter grade and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade -->
        Not Acceptable. At the end your program should print which grade
        was entered by a user with explanation.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        String grade=input.next();
        if(grade.equalsIgnoreCase("A")){
            System.out.println("Excellent");
        }else if(grade.equalsIgnoreCase("B")){
            System.out.println("Good");
        }else if(grade.equalsIgnoreCase("C")){
            System.out.println("Average");
        }else if(grade.equalsIgnoreCase("D")){
            System.out.println("Bad");
        }else{
            System.out.println("Not Acceptable");
        }

    }
}