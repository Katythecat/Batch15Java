package class11;

public class Ex {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},
                {45,55,66},
                {30,40,20,10,25}};

        for(int[] x:matrix){
            for(int num :x){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
