package class3Assignments;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("myString is:");
        String myString = scanner.next();
        System.out.println("myInt is:");
        int myInt = scanner.nextInt();

        System.out.println("myString is:"+myString);
        System.out.println("myInt is:"+myInt);
    }
}
