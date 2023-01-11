package class3;

public class IfEsle_8 {
    public static void main(String[] args) {
        int age = 17;
        if (age < 18) {
            System.out.println("Time to play");
        }

        boolean inSyntaxBootCamp = true;

        /*
        if conditions work based on boolean true or false if we have a true inside the
        if() it executes all the code inside {} if it is false it does not execute
        any code inside{}

         */
        if (inSyntaxBootCamp) {
            System.out.println("Time to start practicing Java");
        }
        /*
        boolean inSyntaxBootCamp = true;
        if (true) {
            System.out.println("Time to start practicing Java");
        }*/
    }
}