package randomPractice;

import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number more than 2 digits");
        int num=input.nextInt();

        int count=0;

        while(num>0){
            num=num/10;//we divide by 10 to eliminate the last digit of number
                        // divide will remove tha last digit and don't print in console
            count++;// as soon as we have an action we will count
        }
        System.out.println("The digits of this number is "+count);
    }
}
