package randomPractice;

public class Primemy {
    public static void main(String[] args) {
        int a = 4;

        boolean flag = true;
        if (a > 2) {
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(a + " Is a prime number " + flag);
    }
}
