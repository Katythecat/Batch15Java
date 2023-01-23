package class12.Assignments;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1) Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
 print the character in the middle of the String.
For Example String str=hello =>l
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word=input.nextLine();

        if (!word.isEmpty()) {
            if (word.length() % 2 != 0 && word.length() >= 3) {
                int middleChar= word.length() / 2;
                System.out.println(word.charAt(middleChar));
            }else{
                System.out.println("Invalid word");
            }
        }
    }
}

