package class13.Assignments;

public class Task5 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true
Abbc =>false
         */

        String s="level";
        String rev="";
        for (int i=s.length()-1;i>=0;i--) {
            rev=rev+s.charAt(i);
        }if(rev.equals(s)){
            System.out.println("This is palindrome :"+s);
        }else{
            System.out.println("This is not palindrome");
        }
    }
}
