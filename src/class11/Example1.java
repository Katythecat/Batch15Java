package class11;

public class Example1 {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}};

        //print odd
        /*for (int i = 0; i < matrix.length; i++) {
            //matrix[i].length the size of each 1D array
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]%2!=0){
                    System.out.print(matrix[i][j]+" ");//45 55 25
                }
            }
            System.out.println();*/
        for(int[] x :matrix ){
            for(int t:x){
                if(t%2!=0){
                    System.out.println(t);
                }
        }

    }
}
        }