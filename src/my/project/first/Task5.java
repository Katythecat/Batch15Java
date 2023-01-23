package my.project.first;

public class Task5 {
    public static void main(String[] args) {
        /*
        5)Create a 2D array of integers.
        Develop a program which will calculate the sum of
         even and odd numbers for that array.
         */
        int[][] numbers={{23,55,12,64,12},
                        {1,3,5,7,12,},
                        {22,24,26,12,53},
                        {1,11,7,9,5}};
        int sumOdd=0;
        int sumEven=0;
        for (int i = 0;  i< numbers.length;i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    sumEven+=numbers[i][j];
            }else{
                    sumOdd+=numbers[i][j];
                }
            }
        }
        System.out.println("Sum of ever numbers is:"+sumEven);
        System.out.println("Sum of odd numbers is:"+sumOdd);
    }
}
