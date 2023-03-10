package randomPractice.JanTask;
import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args) {
        /*
         Write a program that will read three inputs of scores
(quiz, mid term, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
         */
            Scanner input=new Scanner(System.in);
        System.out.println("Please enter your quiz, midterm , final scores");
        int quize= input.nextInt();
        int midTerm= input.nextInt();
        int finalScore=input.nextInt();

        int scores=(quize+midTerm+finalScore)/3;
        if(scores>=90){
            System.out.println("Congrats !!!! you got A grade");
        }else if(scores>=70 && scores< 90){
            System.out.println("Well done , you got B grade");
        }else if(scores>=50 && scores<70){
            System.out.println("Nah , you got C grade");
        }else{
            System.out.println("You need to study harder, you got F grade");
        }

        }
    }
