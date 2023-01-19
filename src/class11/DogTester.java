package class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {
        //Creating an actual object from tha class Scanner
        //Scanner scanner=new Scanner(System.in);
        //This is how we create the object of a class
        Dog dog1=new Dog();
        dog1.name="Leo";
        dog1.breed="Short Hair";
        dog1.age=8;
        dog1.weight=16;
        dog1.color="Black";

        dog1.display();

        dog1.bark();


    }
}
