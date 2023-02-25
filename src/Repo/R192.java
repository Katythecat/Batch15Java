package Repo;

import java.util.LinkedList;

public class R192 {
    public static void main(String[] args) {
        LinkedList<Integer> prime = new LinkedList<>();
        for(int i=2;i<=100;i++){
            boolean flag=true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                prime.add(i);
            }
        }
        System.out.println(prime);
    }
}
