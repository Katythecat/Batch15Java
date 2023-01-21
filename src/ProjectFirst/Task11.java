package ProjectFirst;

public class Task11 {
    public static void main(String[] args) {
        /*
        11)Write a program to print out duplicate elements from an Array of Strings?
         */
        String[] word = {"Leo", "Nala", "Miami", "Lynwood", "leo","Leo"};
        boolean flag = false;

        for (int i = 0; i < word.length; i++) {
            for (int j = i+1; j < word.length; j++) {
                if (word[i] == word[j]) {
                    System.out.println("This is duplicate elements " + word[i]);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("Duplicate elements NOT found");

        }
    }
}
