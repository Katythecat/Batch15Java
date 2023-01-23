package randomPractice;

public class StarSquare {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            if (i == 0 || i == 4)
                for (int j = 0; j <= 4; j++) {
                    System.out.print("*");
                }
            else {
                for (int j = 0; j <= 4; j++) {
                    if (j == 0 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print("$");
                    }
                }

            }
            System.out.println();
        }
    }
}



