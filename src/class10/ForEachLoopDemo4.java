package class10;

import java.util.Arrays;

public class ForEachLoopDemo4 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};
        //Below code prints all the elements from an array without a loop
      // ONLY if you want to view the elements
        System.out.println(Arrays.toString(arr));

        //if we don't use loop we cannot type the code below
        //System.out.println(arr[i]);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }


            }
        }
        

