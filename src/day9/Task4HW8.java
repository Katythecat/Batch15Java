package day9;

import java.util.Scanner;

public class Task4HW8 {
    public static void main(String[] args) {
        /*
        Write a program to ask a user to enter item they want to buy and the price of that item.
        User will be entering 5 items Every time user enters price accumulate the price
        and tell the user how much total they should pay.
        If user give more money program should return a change.
        Whenever a user done with payments program should say "Thank you for shopping!"
         */

        /*
        step
        1.Ask user for item price and item name

        2.accumulate the price
        3.tell the user how much total they should pay
        4.If user give more money program should return a change
        5."Thank you for shopping!"
         */
        /*Scanner scanner=new Scanner(System.in);
       String item;
       double price, total;
       double money=0;

        System.out.println("Please enter items you want to buy");
        item=scanner.next();

        System.out.println("Please enter price of your item");
        price=scanner.nextInt();

        price+=price;
        System.out.println("Your amount is"+price);

        if(money>price){
            System.out.println("Here is your change"+(money-price));
            System.out.println("Thank you for shopping");

        }*/

       // while(true){
        Scanner scanner = new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 5; i++) {

            System.out.println("Please enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the totalPrice amount you have to pay "+ totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>totalPrice){
            double change=amountPaid-totalPrice;
            System.out.println("Hey here is your change "+change);
        }else if(amountPaid<totalPrice){
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thank you for shopping!");







        }







    }

