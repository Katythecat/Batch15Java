package class13.Assignments;

public class Task6 {
    public static void main(String[] args) {
        /*
        6) How would you swap  2 strings without a temporary variable?
         */

        String a="Leothecat";
        String b="Nalathecute";

        System.out.println("Before swapping string a is "+a+" b is "+b);

         a=a+b;
         b=a.substring(0,a.length()-b.length());
         a=a.substring(b.length());

        System.out.println("Before swapping string a is "+a+" b is "+b);


    }
}
