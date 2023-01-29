package class16;

public class Task3 {

    void isPalindrome(String inputStr) {
        String rev = new StringBuilder(inputStr).reverse().toString();
        if (rev.equals(inputStr)) {
            System.out.println("This is palindrome " + inputStr);
        } else {
            System.out.println("This is not palindrome " + inputStr);
        }

    }


    public static void main(String[] args) {
        /*String str="dad";
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversed=st.toString();
        if(str.equals(reversed)){
            System.out.println("This is palindrome"+reversed);
        }else{
            System.out.println("This is not palindrome"+reversed);
        }
    }*/

        Task3 ts = new Task3();
        ts.isPalindrome("DAD");
        //String result=ts.isPalindrome("DAD"); can't assign void methods to variables
       // System.out.println( ts.isPalindrome("DAD")); can't use void methods in println
    }
}