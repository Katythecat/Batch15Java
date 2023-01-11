package day5Assignments;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
           /* 3) Write a program that will read three inputs of scores
            (quiz, midterm, and final scores) and determine the grade
            based on the following rules:if the average score >=90 → grade=A
            if the average score >= 70 and <90 → grade=B score>=50 and <70 → grade=C
            if the average score<50 → grade=F */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your quiz scores from 1-100");
        double quiz=input.nextDouble();

        System.out.println("Please enter your midterm scores from 1-100");
        double midterm=input.nextDouble();

        System.out.println("Please enter you final scores from 1-100");
        double finalScore=input.nextDouble();

        double average=(quiz+midterm+finalScore)/3;

        if(average>90){
            System.out.println("You got grade A");
        }else if(average>=70&&average<90){
            System.out.println("You got grade B");
        }else if(average>=50&&average<70) {
            System.out.println("You got grade C");
        }else{
            System.out.println("You got grade F");
        }
    }
}
