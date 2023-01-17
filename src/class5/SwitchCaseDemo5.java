package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your gender m/f");
        char gender=scan.next().charAt(0);

       // char gender='f';
        switch (gender){

            case 'f':
            case 'F':
                System.out.println("Female");
               break;
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
           default:
                System.out.println("Not specified");
        }


    }

    }

