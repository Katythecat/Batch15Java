package class10;

public class D2ArraysDemo1 {
    public static void main(String[] args) {
        int[][] matrix={{10,20,30},
                        {55,22,45,50},
                         {100,220,450}};

       // System.out.println(matrix[1][1]);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

    }
}
