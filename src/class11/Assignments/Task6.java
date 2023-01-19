package class11.Assignments;

public class Task6 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
         Print the sum of all numbers
         */

        int[][] num={{8,2,10},
                {7,3,5},
                {4,6,15}};

        int sum=0;

        for (int i = 0; i <num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum+=num[i][j];
            }
        }
        System.out.println(sum);

    }
}
