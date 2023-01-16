package day6.day6Assignments;
import java.util.Scanner;
public class Replit35First {
    public static void main(String[] args) {
//same result in Ij but didn't pass in Replit
        Scanner input = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = input.nextBoolean();
        if (loan) {

            System.out.println("What is your credit score?");
            int score = input.nextInt();

            if (score < 600) {
                System.out.println("The eligiblility is Not eligible");
            } else if (score >=600 && score <= 700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (score >= 701 && score <= 800) {
                System.out.println("The eligibility is Eligible");
            } else {
                System.out.println("The eligibility is Definitely eligible");
            }
        }else{
            System.out.println("Unknown");
        }
            }
}







