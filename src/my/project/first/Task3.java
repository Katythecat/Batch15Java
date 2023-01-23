package my.project.first;

public class Task3 {
    public static void main(String[] args) {
        /*
        3) Create a 2D array of integer values. Print the sum of all numbers.
         */
        int[][]num={{5,45,22,7,1,12},
                    {3,5,7,3,7,},
                    {2,3,4,5},
                    {34,6,8,11,33,98,6},
                    {7}};
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                    sum += num[i][j];
                }
            }
            System.out.println("Sum of this 2d array is:"+sum);

        }

    }

