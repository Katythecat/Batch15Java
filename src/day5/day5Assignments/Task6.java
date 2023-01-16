package day5.day5Assignments;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        6)Write a program to find largest number among three numbers
        using nested if provided by a user (numbers must be distinct)
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 different numbers");
        int number1, number2, number3;
         number1 = input.nextInt();
         number2 = input.nextInt();
         number3 = input.nextInt();

        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("This is a largest number:" + number1);
            }
        }
        if (number2 > number3) {
            if (number2 > number1) {
                System.out.println("This is a largest number:" + number2);
            }
        }else {
                System.out.println("This is a largest number:" + number3);
            }

        }
    }







