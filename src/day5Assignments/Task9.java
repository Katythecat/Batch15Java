package day5Assignments;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        /*
        8)Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        double number1=input.nextDouble();
        //double number2=input.nextDouble();
        System.out.println("Please enter second number");
        double number2=input.nextDouble();

        System.out.println("Please enter operator +,-,*,/");
        char operator=input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Your result:" + (number1 + number2));
                break;
            case '-':
                System.out.println("Your result;" + (number1 - number2));
                break;
            case '*':
                System.out.println("Your result;" + (number1 * number2));
                break;
            case '/':
                System.out.println("Your result;" + (number1 / number2));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
