package ProjectFirst;

public class Task10 {
    public static void main(String[] args) {
        /*
        10)Write a java program to find the second-largest number in the array?
         */

        int[] num={5,25,11,2,16,50,42};
        int largest=num[0];
        int secondLargest=num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];
            } else if (num[i] > secondLargest) {
                secondLargest = num[i];
            }
        }
        System.out.println(secondLargest);
    }
}
