package randomPractice.JanTask;

import java.util.Scanner;

public class WeekendWeekday {
    public static void main(String[] args) {
        /*
        Write a program that will print whether it is a weekend or weekday.
        If any day from 1-5 → output “It is a weekday”,
         anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number of day in week");
        int num=input.nextInt();
        if(num>=1 && num <= 5){
            System.out.println("It is a weekday");
        }else if(num == 6 || num == 7){
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}
