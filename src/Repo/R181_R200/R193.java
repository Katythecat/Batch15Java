package Repo.R181_R200;


import java.util.LinkedList;

public class R193 {
    public static void main(String[] args) {
        LinkedList<Integer>number=new LinkedList<>();
        number.add(111);
        number.add(222);
        number.add(333);
        number.add(444);
        number.add(555);
        number.add(666);

        int sum=0;
        for(int n:number){
            sum+=n;
        }
        System.out.println(sum);

    }
}
