package randomPractice;

import java.util.Scanner;

public class Replit99 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();

        String revStr = "";
        for (int i = givenString.length() - 1; i >= 0; i--) {
            revStr += givenString.charAt(i);
        }

        boolean flag = true;
        if (givenString.equalsIgnoreCase(revStr)) {
            System.out.println(flag);
        } else {
            System.out.println(!flag);
        }

    }
}
