package randomPractice;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] num=new int[5];
       //System.out.println("enter 5 number");
        for(int i=0;i<num.length;i++){
            num[i]=input.nextInt();
            System.out.println(num[i]);
        }
        for(int i=num.length-1;i>=0;i--){
            System.out.println(num[i]);
        }
    }
}

