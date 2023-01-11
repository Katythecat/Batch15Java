package day6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the day");
        String day=input.next();
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("No class today");
        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("We have Java class");
        }else if(day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual class");
        }else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Wrong day entered");
        }

    }
}
