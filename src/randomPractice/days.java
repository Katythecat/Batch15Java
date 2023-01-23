package randomPractice;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {
            /*
            Write a program that creates a String array with size 7.

Ask the user to input Days of a week beginning with Sunday using Scanner class.

Add these inputs to your array and then print all values from that array
             */
        //String[] day={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String[] days=new String[7];
        days[0]="Sunday";
        days[1]="Monday";
        days[2]="Tuesday";
        days[3]="Wednesday";
        days[4]="Thursday";
        days[5]="Friday";
        days[6]="Saturday";

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter day of a week");
        //String days=input.next();
        String[] day= new String[]{input.next()};


        }
        }



