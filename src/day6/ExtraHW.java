package day6;

import java.util.Scanner;

public class ExtraHW {
    public static void main(String[] args) {
        //find the largest number of 3 numbers
        Scanner input=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter 3 distinct numbers");
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();

        if(num1>num2&&num1>num3){
            System.out.println("The largest number is:"+ num1);
        }else if(num2>num3&&num2>num1) {
            System.out.println("The largest number is:" + num2);
        }else{
            System.out.println("The largest number is:" + num3);
        }
    }
}
