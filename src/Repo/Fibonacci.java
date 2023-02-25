package Repo;

import java.util.LinkedList;

public class Fibonacci {
    public static void main(String[] args) {
        LinkedList<Integer>fibo=new LinkedList<>();
        fibo.add(0);
        fibo.add(1);
        int n=10;
        //0 1 1 2 3 5 8 13 21 34
        for(int i=2;i<n;i++ ){
            int a=fibo.get(i-1);
            int b=fibo.get(i-2);
            fibo.add(a+b);
        }
        for(int f:fibo){
            System.out.print(f+" ");
        }
    }
}
