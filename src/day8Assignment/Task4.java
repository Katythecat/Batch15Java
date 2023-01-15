package day8Assignment;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
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
