package class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] num={10,20,30,40,50,};
        System.out.println(num[4]);
        //can we print two numbers from an array
        System.out.println(num[1]+" "+num[2]);

        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);

        }
        //Enhanced for loop
        //when ever possible use this loop
        //we use in array

        for (int j : num) {
            System.out.println(j);

        }



    }

}
