package class15;

import class16.Person;

import java.util.Scanner;


public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        person.printTiktokAccount();
        Scanner scanner=new Scanner(System.in);
        scanner.next();

    }
}