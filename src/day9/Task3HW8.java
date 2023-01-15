package day9;

import java.util.Scanner;

public class Task3HW8 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int evenSum=0; // accumulate
        int oddSum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                evenSum+=i;// or evenSum=evenSum+i;
            }else {
                oddSum=oddSum+i;// or oddSum+=i;
            }
        }
        System.out.println("Sum of all the Even numbers "+evenSum);
        System.out.println("Sum of all the Odd numbers "+oddSum);
    }
}
