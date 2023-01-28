package class14;

public class Task4 {
    public static void main(String[] args) {
        // String str="Thailand is hot like hell";
        /*StringBuilder str=new StringBuilder("Thailand is hot like hell");
        System.out.println(str.reverse());
        String st=str.toString();*/

        String str = "Thailand is hot as hell";
        String[] arr = str.split(" ");

        for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }

    }
}