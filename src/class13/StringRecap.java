package class13;

public class StringRecap {
    public static void main(String[] args) {
        String str="Java is Great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));//i is int and return type is char
        }

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letter a has appeared "+count+" times");


        String k=str.replaceAll("[^a]","");
        System.out.println(k.length());
    }
}
