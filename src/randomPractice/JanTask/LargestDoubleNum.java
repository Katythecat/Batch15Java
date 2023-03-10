package randomPractice.JanTask;

import java.util.Scanner;

public class LargestDoubleNum {
    public static void main(String[] args) {
        /*
  Write a program to find largest of three double values using if-else..if
  and logical operators provided by a user (numbers must be distinct)
         */
       Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 double value number");
        double num1= input.nextDouble();
        double num2= input.nextDouble();
        double num3= input.nextDouble();
        if(num1>num2&&num1>num3){
            System.out.println(num1+" is the largest number");
        }else if(num2>num3&&num2>num1){
            System.out.println(num2+" is the largest number");
        }else{
            System.out.println(num3+" is the largest number");
        }
    }
}
