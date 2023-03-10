package Repo.R181_R200;

import java.util.ArrayList;

public class R185 {
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();
        number.add(111);
        number.add(111);
        number.add(111);
        number.add(999);
        number.add(999);
        number.add(999);

        for(int i=0;i<number.size();i++){
            System.out.println(number.get(i));
        }

        for(int i=0;i<number.size();i++){
            int n=number.get(i);
            System.out.println(n);
        }

        for(int num:number){
            System.out.println(num);
        }
    }
}
