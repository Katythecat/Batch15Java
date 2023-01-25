package class13.Assignments;

public class Task2 {
    public static void main(String[] args) {
        /*
        2) Create a String that should be combination of letters,
        numbers and special characters. Find out how many Alphanumeric(abd AZ 284)
         characters are there in the String.
         */

        String str="jdsa;ifej1236236AVAHXVA!#$!^%*^$(";
        System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());





    }
}
