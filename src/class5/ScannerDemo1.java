package class5;


import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        Scanner --> Name of the class
        scan is just a variable like we create primitive variables
        = --> assignment operator
        System.in --> tells the computer we want to read the data from keyboard
         */
/*
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" Years old");

        System.out.println("Please enter you weight");
        double weight=scan.nextDouble();
        System.out.println("You weight is "+ weight+ " lbs ");
        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);*/

      System.out.println("Please enter you gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);

        System.out.println("Please enter your name");
        String name=scan.next();//when we have to take only one word as input
        System.out.println("You name is "+name);

        scan.nextLine();//Trick to make nextLine method work after we have used any
        //other method from
        System.out.println("Please enter you full name ");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close();// Good practice




    }

}
