package class12;

public class StringDemo2 {
    public static void main(String[] args) {
        //only convert the upper case letters to the lower case
        String str="JAVA IS FUN 12234%*$";
        String newstr=str.toLowerCase();
        System.out.println(newstr);//java is fun
        System.out.println(str.toLowerCase());

        String str2="i love java";
        String str2new=str2.toUpperCase();
        System.out.println(str2new);


    }
}
