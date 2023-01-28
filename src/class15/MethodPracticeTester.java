package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice mt = new MethodPractice();
        boolean isEven1=mt.isEven1(5);
        System.out.println(isEven1);
        //System.out.println(mt.isEven1(8));

        boolean isEven2=mt.isEven(100);
        System.out.println(isEven2);

        System.out.println(mt.isEven(12));

        System.out.println(mt.isEven(20));

    }
}