package class6.Assignments;

import java.util.Scanner;

public class Replit35Correct {

    //this code is perfect you have to think like a dev if you want to come back
    // and change your code this way is more effective
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = input.nextBoolean();
        String eligibility;
        if (loan) {
            System.out.println("What is your credit score?");
            int score = input.nextInt();

            if (score < 600) {
                eligibility = "Not eligible";
            } else if (score >= 600 && score <= 700) {
                eligibility = "Maybe eligible";
            } else if (score >= 701 && score <= 800) {
                eligibility = "Eligible";
            } else {
                eligibility = "Definitely eligible";
            }
        } else {
            eligibility = "Unknown";
        }
        System.out.println("The eligibility is "+eligibility );
    }
}
