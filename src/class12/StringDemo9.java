package class12;

public class StringDemo9 {
    public static void main(String[] args) {

        String str="Java is love";
        char c=str.charAt(0);
        System.out.println(c);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));//Java is love
        }

        System.out.println();

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;
            }
            System.out.print(str.charAt(i));

        }
        System.out.println();
        System.out.println("Number of a is: "+count);

    }
}
