package RandomPractice;

public class RepDollars {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            if (i == 0 || i==3)
                for (int j = 0; j <= 3; j++) {
                    System.out.print("$");
                }else{
                for (int j = 0; j <= 3; j++) {
                    if (j == 0 || j == 3) {
                        System.out.print("$");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
