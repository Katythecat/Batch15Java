package my.project.first;

public class Task4 {
    public static void main(String[] args) {
        /*
        4) Create a 2D array or integer type where you will store odd and even numbers.
         Develop a program which will identify/print the even numbers only.
         */
        int[][] numbers={{23,41,2,5,9,13},
                        {4,6,9,1,8},
                         {2,5,7,12}};


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();
        }



            }

        }



