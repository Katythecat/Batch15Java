package Repo;

import java.util.ArrayList;
import java.util.Scanner;

//this code is not good if you advance enough come back to read it again

public class R188 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> number=new ArrayList<>();
        System.out.println("Enter number");
        while(input.hasNextInt()){//<-- This will loop until you enter any non integer value 1 2 3 4 5 k
            number.add(input.nextInt());
        }

        Integer[] a= number.toArray(new Integer[0]);// so confuse to do this line
        for (Integer integer : a) {
            System.out.println(integer + " ");

        }
        }
    }



