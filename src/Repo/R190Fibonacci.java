package Repo;

import java.util.LinkedList;

public class R190Fibonacci {
    public static void main(String[] args) {
        LinkedList<Integer> number=new LinkedList<>();
        /*int a=10;
        number.add(0);
        number.add(1);
        for (int i = 2; i < a; i++) {
            int first=number.get(i-1);
            int second=number.get(i-2);
            number.add(first+second);
        }
        for(int f:number){
            System.out.print(f+" ");
        }

        System.out.println();*/

        int n=10;
        int[] num=new int[n];

        num[0]=0;
        num[1]=1;

        for(int i=2;i<n;i++){
            num[i]=num[i-1]+num[i-2];
        }
        for(int f:num){
            System.out.print(f+" ");
        }

       /* System.out.println();
        int z=0;
        int y=1;
        System.out.print(z+" "+y+" ");
        for (int i = 2; i < 10; i++) {
            int x=z+y;
            System.out.print(x+" ");
            z=y;
            y=x;

        }*/

    }

}
