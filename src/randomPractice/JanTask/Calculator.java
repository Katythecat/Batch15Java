package randomPractice.JanTask;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
    Based on operator provide the result to user.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Enter the operator(+ - * /)");
        char operator = input.next().charAt(0);

        double result ;

        switch (operator){

            case '+' :result=num1+num2;break;
            case '-' :result=num1-num2;break;
            case '*' :result=num1*num2;break;
            case '/' :result=num1/num2;break;
            default:
                System.out.println("Invalid");return;
        //In this case, we print an error message to the console,
        // and then we use return to exit the main method and stop further execution
        //when this error msg print we won't show the print below
        //if we don't use this return it will show          Invalid
        //                                                  Result 0.0
    }
        System.out.println("Result "+ result);


        /*switch(operator){
            case '+':
                System.out.println(num1+num2);break;
            case '-' :
                System.out.println(num1+num2);break;
            case '*':
                System.out.println(num1*num2);break;
            case '/' :
                System.out.println(num1/num2);break;
            default:
                System.out.println("Invalid");
        }
*/   // in this case we don't need return bc


    }
}
