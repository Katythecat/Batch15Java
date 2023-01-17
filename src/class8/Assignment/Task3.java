package class8.Assignment;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Write a program that reads a range of integers (start and end point),
        provided by a user and then from that range prints the sum
        of the even and odd integers.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int num1 = input.nextInt();

        System.out.print("Enter the end of the range: ");
        int num2= input.nextInt();

        int even = 0;
        int odd = 0;

        for(int i = num1;i<=num2;i++){
            if(i%2==0){
                even += i;
            }else{
                odd += i;
            }
        }
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
        }
    }



