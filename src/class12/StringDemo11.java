package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="Java is not pain";
        System.out.println(str.toLowerCase().indexOf("j"));//0
        System.out.println(str.indexOf("a"));//1 it will refer the first a

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" has the index "+i);
        }




    }
}