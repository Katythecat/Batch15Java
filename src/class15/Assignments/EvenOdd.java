package class15.Assignments;

public class EvenOdd {
    void num(int a) {

        if (a % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is odd number");
        }
    }

    public static void main(String[] args) {
        EvenOdd eo=new EvenOdd();
       eo.num(18);
    }
}

