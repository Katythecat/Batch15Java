package day9;

public class ArrayDemo8 {
    public static void main(String[] args) {
        //write the program that can tell us how many times the number 10.5 is
        //present in the array
        double[] arr={10.5,12.0,45,10.5,23,10.5};
        int count=0;// will hold the count how many times it appears
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==10.5){
                count++;
            }
        }
        System.out.println(count);

    }
}
