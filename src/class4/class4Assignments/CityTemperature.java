package class4.class4Assignments;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your city?");
        String city = input.nextLine();

        System.out.println("What is the temperature");
        double tem = input.nextInt();
        tem = (tem-32)*.5556;

        System.out.println("The temperature is "+ tem +" celsius "+ "the city is "+ city);

    }
}
