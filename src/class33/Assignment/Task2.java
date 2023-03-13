package class33.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /*
        2) Create a static method that will return a List of Exceptions.
        Inside your method create objects of 4 exception classes using
        try and catch blocks and store them inside your list.
        Call your method inside main and print name and details of all
        Exception objects.
         */
    public static List<Exception> exceptionList() {
        List<Exception> exceptions = new ArrayList<>();
        try {
            int a = 100, b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e);
            exceptions.add(e);
        }
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            exceptions.add(e);
        }
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e + " : cannot find length of String with null value");
            exceptions.add(e);
        }
        try {
            String s = "cat";
            s.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
            exceptions.add(e);
        }
        return exceptions;
    }

    public static void main(String[] args) {

            exceptionList();
        }
    }
