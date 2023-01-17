package class9;

public class ArrayDemo6 {
    public static void main(String[] args) {
        // Create an empty array then store 45 44 33 20 and 10 in it then use a loop
        // to add all the elements which are present in even indexes and print it after adding them

        int[] num = new int[5];
        num[0] = 45;
        num[1] = 44;
        num[2] = 33;
        num[3] = 20;
        num[4] = 10;
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {//ask for use index number if even
                sum += num[i];
            }
        }
        System.out.println(sum);

            System.out.println("---------");
            // create an array and store 10,20,30,4,5,6,7,80
            // add all the element which are multiple of 2

            int[] number = {10, 20, 30, 4, 5, 6, 7, 80};
            int add = 0;
            for (int j = 0; j < number.length; j++) {

                if (number[j] % 2 == 0) {

                    add += number[j];
                }
            }
            System.out.println(add);


        }


    }












