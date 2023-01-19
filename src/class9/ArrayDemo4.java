package class9;

import java.util.Arrays;

public class ArrayDemo4 {
    public static void main(String[] args) {

        char[] letter={'A','B','c','d','e','F'};
        letter[0]='a';//how to update an element at index0

        System.out.println("After update element");
        for (char c : letter) {
            System.out.print(c + " ");
        }
        System.out.println();

    }
}
