package class8.Assignment;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*Write a program to ask a user to enter item they want to buy and the price of that item. User will
        be entering 5 items. Every time user enters price accumulate the price and tell the user how much
        totalPrice that they should pay.
                If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your item");
        String item=input.nextLine();

        System.out.println("Please enter the price of an item");
        double price=input.nextInt();

        while(price>0){
            System.out.println("How much you would like to pay?");
            double givenAmount=input.nextInt();

            price-=givenAmount;
            if(price>0){
                System.out.println("Please give me more "+price+" dollars");
                break;
            }else{
                System.out.println("Here is your change "+price+ " dollars");
                System.out.println("Thank you for shopping");
            }

        }
    }
}
