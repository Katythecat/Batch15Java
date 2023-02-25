package Repo;

import java.util.LinkedList;

public class R190 {
    public static void main(String[] args) {
        LinkedList<Integer>fibo=new LinkedList<>();

        /*int f=10;
        fibo.add(0);
        fibo.add(1);

        for (int i = 2; i < f; i++) {
            int x = fibo.get(i - 1);
            int y = fibo.get(i - 2);
            fibo.add(x + y);
        }
        for(int fib:fibo){
            System.out.print(fib+" ");
*/
            int n=10;
            int[] fibonacci=new int[n];

            fibonacci[0]=0;
            fibonacci[1]=1;

            for(int i=2;i<n;i++){
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }
            for(int num:fibonacci){
                System.out.print(num+" ");
            }






            //int c=a+b;
            //System.out.println(c+" ");
           // a=b;
           // b=c;
        }

    }

