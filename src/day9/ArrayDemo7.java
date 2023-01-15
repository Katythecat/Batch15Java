package day9;

public class ArrayDemo7 {
    public static void main(String[] args) {


            // create an array and store 10,20,30,4,5,6,7,80
            // add all the element which are multiple of 2

            int[] number = {10, 20, 30, 4, 5, 6, 7, 80};
            int add = 0;
            for (int j = 0; j < number.length; j++) {
                if (number[j] % 2 == 0) {//this will check the values
                    add += number[j];
                }
            }
            System.out.println(add);


        }


    }












