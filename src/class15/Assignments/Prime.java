package class15.Assignments;

public class Prime {

    void isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
                if (count == 2) {
                    System.out.println("This number is prime " + num);
                } else {
                    System.out.println("This number is not prime " + num);
                }
            }

    public static void main(String[] args) {
        Prime pm = new Prime();
        pm.isPrime(5);

    }
}