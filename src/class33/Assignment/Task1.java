package class33.Assignment;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {
    /*
       1) How would handle InputMismatchException? Input Mismatch Exception
       when user enters mismatch value than programmer expected.
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter school name");
        String school = input.next();
        try {

            System.out.println("Enter your batch");
            int grade = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println(e+" : You should enter batch in Number");


        } finally {
            System.out.println("Finally we are done with Java");
        }



    }
}
