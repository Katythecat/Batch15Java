package class4.class4Assignments;

import java.util.Scanner;

public class CreditCardOffer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String card = input.next();

        if (card.equals("Yes")) {
            System.out.println("What is your balance on your credit card?");
            int balance = input.nextInt();
            if (balance > 1000) {
                System.out.println("Pay them off immediately");
            } else {
                System.out.println("You can spend more");
            }
        }

            if (card.equals("No")) {
                System.out.println("I offer you a credit card");
            }

    }
}



