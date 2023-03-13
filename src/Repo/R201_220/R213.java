package Repo.R201_220;
import java.util.Scanner;
public class R213 {


    public static void tempCheck(int temp){
            if(temp<32){
                throw new RuntimeException("It is freezing");
            }
        }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tem=input.nextInt();

        try{
            tempCheck(tem);
        }catch(RuntimeException e){
            System.out.println(e);
        }
    }
}


