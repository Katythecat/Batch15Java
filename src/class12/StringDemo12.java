package class12;

public class StringDemo12 {
    public static void main(String[] args) {
        String str="Send it to support channel. More java";
        String newStr=str.substring(28);//to ignore the 28 first
        System.out.println(newStr);//More java
        System.out.println(str.substring(0,27));//Send it to support channel.




    }
}