package class12.Assignments;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        2) Create a String and print it in reverse order (Sunday → yadnuS).
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter some word ");
        String word=input.next();
        String ampty="";

        System.out.println("The word before reverse is:"+word);
        for (int i=word.length()-1;i>=0;i--) {
            System.out.print(word.charAt(i));
        }

        System.out.println();
        /*for (int i = word.length()-1; i >=0 ; i--) {
            ampty=ampty+word.charAt(i);
        }
        System.out.println("The word after reverse is:"+ampty);*/

        StringBuffer sb=new StringBuffer(word);
        System.out.println(sb.reverse());
    }
}
