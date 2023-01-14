package RandomPractice;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number more than 3 digits");
        int num=input.nextInt();
        int reverse=0;
        int lastdigit;

        while(num>0){
            lastdigit=num%10;
            reverse=reverse*10+lastdigit;
            num=num/10;


        }
        System.out.println("After reverse number"+reverse);

    }
}
