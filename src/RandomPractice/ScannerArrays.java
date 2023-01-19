package RandomPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers=new int[5];
        int sum=0;

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <numbers.length ; i++) {
            sum+=numbers[i];
        }
        System.out.println("Sum of an array elements is:"+sum);
    }
}
