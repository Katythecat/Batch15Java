package day9;

import java.util.Scanner;

public class Task2HW8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want a credit card");
            String userResponse = input.next();
            if (userResponse.equalsIgnoreCase("yes")) {
                break;

            }

        }
    }
    }

