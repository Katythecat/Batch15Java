package class16;

public class Task5 {

    boolean isPrime(int number) {
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Task5 ts=new Task5();
        System.out.println(ts.isPrime(7));
    }
}
