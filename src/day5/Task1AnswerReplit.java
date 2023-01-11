package day5;

import java.util.Scanner;

public class Task1AnswerReplit {
    public static void main(String[] args) {
        /*
    Write a program to find the largest number among three distinct numbers using
    nested if condition Please use Scanner class to take input from useres
     */

       // int num1 = 10, num2 = 20, num3 = 30;
        int num1, num2, num3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();


        if (num1 > num2 && num1 > num3) {
            System.out.println("Number is the largest " + num1);
        }
        if (num2 > num3 && num2 > num1) {
            System.out.println("Number2 is the largest " + num2);
        }
        if(num3>num1&&num3>num2){
            System.out.println("Number3 is the largest "+ num3);
        }
    }
}
