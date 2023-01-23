package my.project.first;


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        7)Write a java program to check whether a given number is prime or not?
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers");

        int num = scanner.nextInt();
        int count=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("This is prime number:" + num);
        }else{
            System.out.println("This is NOT prime number:"+ num);
        }
    }
}

