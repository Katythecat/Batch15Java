package class12.Assignments;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        3) Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
         */
        Scanner input=new Scanner(System.in);
        String mom, dad, expect;
        System.out.println("Please enter mom's first name");
        mom=input.next();//Mary
        System.out.println("Please enter dad's first name");
        dad=input.next();//Daniel
        System.out.println("What are your expecting(boy or girl)?");
        expect=input.next();

        if(expect.equalsIgnoreCase("boy")){
            System.out.println("Suggested baby name:"+((dad.substring(0,3))+(mom.substring(2))).toUpperCase());
        }else{
            System.out.println("Suggested baby name:"+((mom.substring(0,2))+(dad.substring(3))).toUpperCase());
        }

    }
}
