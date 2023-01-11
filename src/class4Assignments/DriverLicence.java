package class4Assignments;

import java.util.Scanner;

public class DriverLicence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("I will issue a driver licence for you");
        }else{
            System.out.println("I will offer you a learners permit");
        }
    }
}
