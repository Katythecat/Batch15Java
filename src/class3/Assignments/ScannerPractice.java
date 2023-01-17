package class3.Assignments;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //in mean input from the keyboard

        System.out.println("What's your name?");
        String name = scan.next();// next will get the first word after enter

        System.out.println("What's your age");
        int age = scan.nextInt();

        System.out.println("What's your quote");
        String quote = scan.next();//next will show only the first word
        quote += scan.nextLine();//we need to plus the first word with the rest of the line

        System.out.println("Thank you "+name+" , you are "+age+" years old");
        System.out.println("and you senior quote is "+quote);


    }
}
