package class5.Assignments;
import java.util.Scanner;
public class T15 {

        public static void main(String[] args) {

        /*
        Write a program to find largest
        number among three numbers using nested if provided by a user
        (numbers must be distinct)
         */

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter three distinct numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int largestNumber;

            if (num1 > num2) {
                if (num1 > num3) {
                    largestNumber = num1;
                    System.out.println("The largest value is " + largestNumber);
                }
            }

            if (num2 > num1) {
                if (num2 > num3) {
                    largestNumber = num2;
                    System.out.println("The largest value is " + largestNumber);
                }
            }
            if (num3 > num1) {
                if (num3 > num2) {
                    largestNumber = num3;
                    System.out.println("The largest value is " + largestNumber);
                }
            }
        }
    }




