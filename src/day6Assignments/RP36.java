package day6Assignments;
import java.util.Scanner;
public class RP36 {

        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            String word1, word2;
            System.out.println("Please enter two strings");
            word1=input.next();
            word2=input.next();

            int int1,int2;
            System.out.println("Please enter two numbers");
            int1=input.nextInt();
            int2=input.nextInt();

            if(int1==int2&&word1.equals(word2)){
                System.out.println("AND");
            }else if(int1==int2||word1.equals(word2)){
                System.out.println("OR");
            }else{
                System.out.println("NONE");
            }

        }
        }







