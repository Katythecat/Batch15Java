package class12;

public class StringDemo10 {
    public static void main(String[] args) {

        String str = "fjoiiejfk 1234556154631 *&^%$# ";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Total alphabet in str " + count);


        int count1=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {//for number
                count1++;
            }
        }
        System.out.println("Total digit in str " + count1);
    }
}