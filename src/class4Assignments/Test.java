package class4Assignments;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("In :");
        String name=input.next();
        //String name="wang";
        String rel=name.equals("chen")?"teacher":"student";
        System.out.println(rel);
    }
}
