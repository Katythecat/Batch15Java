package Repo;

import java.util.ArrayList;
import java.util.Scanner;

//try to make it simple remember this code easy to understand

public class R188ArrayListWithScanner {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int num=input.nextInt();
            numbers.add(num);
        }
        for (int a:numbers){
            System.out.print(a+" ");
        }
    }
}
