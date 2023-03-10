package randomPractice.JanTask;

import java.util.Scanner;

public class LargestNumDistinct {
    public static void main(String[] args) {
        /*
       Write a program to find largest number among three numbers using nested if
       provided by a user (numbers must be distinct)
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 distinct number");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println(num1+" is the largest number");
        }else if(num2>num3&&num2>num1){
            System.out.println(num2+" is the largest number");
        }else{
            System.out.println(num3+" is the largest number");
        }
    }
}
