package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {


        int[] arr = {10, 13, 20, 25, 45, 50};
        //print only odd numbers
       for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        //Replace only the odd numbers with zero
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 != 0) {//print odd number
                arr[i] = 0;//replace odd numbers with zero
            }
        }
        System.out.println("After replacing all odd numbers with zero");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}