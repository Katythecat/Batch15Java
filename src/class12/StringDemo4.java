package class12;

public class StringDemo4 {
    public static void main(String[] args) {

        //.isEmpty to see if it empty or not
        String str="  ";
        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty);// true or false

        System.out.println(str.isBlank());//count everything other than space


    }
}
