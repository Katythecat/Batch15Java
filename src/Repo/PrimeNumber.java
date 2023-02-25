package Repo;

public class PrimeNumber {
    public static void main(String[] args) {
        //prime is a number that divide by 1 and itself and result is 1

        int num = 13;
        boolean flag = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag=false;
        }
        System.out.println(num + " Is prime? " + flag);
    }
}
