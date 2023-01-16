package class4.class4Assignments;

import java.util.Scanner;

public class WorkedYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your work years");
        int workedYears = input.nextInt();
        if (workedYears >= 5) {
            System.out.println("You are eligible for bonus");

            System.out.println("Enter your annual salary");
            int salary = input.nextInt();
            if (salary > 50000) {
                System.out.println("You get 5000 bonus");
            } else {
                System.out.println("You get 3000 bonus");
            }
        }else {
            System.out.println("You are NOT eligible for bonus");

        }
    }
}


