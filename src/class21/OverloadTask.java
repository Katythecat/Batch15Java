package class21;

public class OverloadTask {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
     */

    static void print(int a, int b) {
        System.out.println(a + b);
    }

    static void print(double a, int b){
        System.out.println(a+b);
    }

    static void print(int a, double b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        OverloadTask.print(10,20);
        OverloadTask.print(15.55,20);
        OverloadTask.print(10,20.5,20);

    }
}
