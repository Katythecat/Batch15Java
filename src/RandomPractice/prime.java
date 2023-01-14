package RandomPractice;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number from 1 to 20");
        int num=sc.nextInt();

        int count=0;
        for(int i=1;i<=20;i++){
            if(num%i==0){
                count++;
            }
        }
    if(count==2){
        System.out.println("This is prime number "+num);
    }else {
        System.out.println("This is NOT prime number " + num);
    }
    }
}