package day7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner input = new Scanner(System.in);
        int number = 15;
        while (condition) {
            System.out.println("Please enter a number between 10 to 20");
            int userNumber=input.nextInt();
            if (userNumber > number) {
                System.out.println("Your entered number is greater");
            } else if (userNumber < number) {
                System.out.println("You entered a smaller number");
            } else {
                System.out.println("You won!!!!");
                condition=false;
            }
        }
    }
}
