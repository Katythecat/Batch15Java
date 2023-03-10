package Repo.R181_R200;

import java.util.ArrayList;
import java.util.Scanner;

public class R188List {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer>number=new ArrayList<>();
        for(int i=0;i<5;i++){
            int num=input.nextInt();
            number.add(num);

        }
        for(int n:number){
            System.out.print(n+" ");
        }
    }
}
