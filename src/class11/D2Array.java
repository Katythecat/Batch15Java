package class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {
        int[][] number={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}};

        System.out.println(number[2][4]);
        System.out.println(Arrays.toString(number[0]));//10 20 30
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[0][i]);//10 20 30

        }
        int[] arr=number[0];// getting complete first array from 2D array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//10 20 30
        }
        System.out.println("---------");
        int[] arr1=number[2];
        for (int i = 0; i < number[2].length; i++) {
            System.out.println(arr1[i]);

        }
    }
}
