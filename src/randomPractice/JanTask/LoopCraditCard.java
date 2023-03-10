package randomPractice.JanTask;


import java.util.Scanner;

public class LoopCraditCard {
    public static void main(String[] args) {
        /*
    Create a program that will be asking user to apply for a credit card 10 times.
     As soon you get an “yes” from a user program should stop asking.
         */
        Scanner input=new Scanner(System.in);
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Would you like to apply for credit card (Yes/No)");
            String answer = input.next();
            if(answer.equalsIgnoreCase("Yes")){
                break;
            }
        }
    }
}
