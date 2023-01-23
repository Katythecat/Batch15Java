package randomPractice;

import java.util.Scanner;

public class TaskOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=input.nextInt();
        System.out.println("Please enter second number");
        int num2=input.nextInt();
        int sumeven=0;
        int sumodd=0;

        for(int i=num1;i<=num2;i++){
            if(i%2==0){
                sumeven=i+sumeven;
            }else{
                sumodd=i+sumodd;
            }
        }
        System.out.println("sum of even is "+sumeven);
        System.out.println("sum of odd is "+sumodd);
    }
}
