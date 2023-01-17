package class4.Assignments;

import java.util.Scanner;

public class LoanSpecialist {
    /*
    You are a loan specialist and you need to ask user what is the amount of loan
     is needed. If loan is less or equal to 200,000 then you would lend the money
      otherwise you would reject the client.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is amount of loan do you need?");
        int loan = input.nextInt();
        if(loan<=200000){
            System.out.println("Congratulation your application has been approved ");
        }else{
            System.out.println("I'm sorry your application has been rejected");
        }
    }
}
