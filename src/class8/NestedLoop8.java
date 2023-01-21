package class8;

public class NestedLoop8 {
    public static void main(String[] args) {

        /*
        0 1 2 3 4 5
        0 2 4 6 8 10
        0 3 6 9 12 15
         */
       /* for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 5; i ++) {
            System.out.print(2*i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 5; i ++) {
            System.out.print(3*i + " ");
        }
        System.out.println();
    }*/
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print( i*j + " ");
            }
            System.out.println();
        }

    }
}








