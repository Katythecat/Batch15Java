package class3.class3Assignments;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.next();

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.println("Why you are here?");
        String answer = sc.next();
        answer += sc.nextLine();

        System.out.println("How many siblings do you have?");
        int sib = sc.nextInt();

        System.out.println("My name is "+name+" ,"+age+" years old "+answer+" I have "+ "sibling");


    }
}
