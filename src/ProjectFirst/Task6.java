package ProjectFirst;

public class Task6 {
    public static void main(String[] args) {
        /*
        6)Write a program to swap 2 numbers without a temporary variable?
         */
        int a=10, b=20;
        System.out.println("Number before swapping a:"+a+" b:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Number after swapping a:"+a+" b:"+b);
    }
}
