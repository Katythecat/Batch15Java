package class5.Assignments;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       /* 2) Write a program that will print whether it is a weekend or weekday.
             If any day from 1-5 → output “It is a weekday”,
             any day from 6-7 → output “It is a weekend”,
             any other day → output “Invalid day”
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter any number start from 1");
        int number=input.nextInt();

        if(number>=1&&number<=5){
            System.out.println("This is a weekday");
        }else if(number>=6&&number<=7){
            System.out.println("This is weekend");
        }else{
            System.out.println("Invalid day");
        }

    }
}
