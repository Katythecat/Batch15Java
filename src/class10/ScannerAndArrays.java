package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 number");
        int[] numbers = new int[5];
        //below code manually store numbers in the array

     /* numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=40;
        numbers[4]=50;*/

        //below code take the numbers from user and store them in the array its good
        //but a lot of code

      /*  numbers[0]=input.nextInt();
        numbers[1]=input.nextInt();
        numbers[2]=input.nextInt();
        numbers[3]=input.nextInt();
        numbers[4]=input.nextInt();*/

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            //System.out.println(numbers[i]); we cannot use this code after get input
            //from user
        }
             System.out.println(Arrays.toString(numbers));
        //but we can use this instead



        // or we have to rewrite the same loop again, then we can call this code
      /*  for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
     */


    }
}