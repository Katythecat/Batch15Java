package day8;

public class LoopPrac {
    /*
    0 1 2 3 4 5
    0 2 4 6 8 10
    0 3 6 9 12 15
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
           for(int j= 0 ;j<=5;j++){
               System.out.print(i*j+" ");
           }
            System.out.println();
        }
    }
}
