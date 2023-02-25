package Repo;


import java.util.ArrayList;

public class PrimeList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 2; i <100 ; i++) {
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            if ( i%j == 0) {
                flag = false;
                break;
            }
        }
            if (flag) {
                number.add(i);//but for store in list we need this line
        }
    }
        System.out.println(number);
}}