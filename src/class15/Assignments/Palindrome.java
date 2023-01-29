package class15.Assignments;

public class Palindrome {
    String palindrome(String str ) {
        String reverse=new StringBuilder(str).reverse().toString();
          if (reverse.equals(str)) {
                return "This is palindrome";
            } else {
                return "This is not palindrome";
            }
        }

    public static void main(String[] args) {
        Palindrome pl=new Palindrome();
        System.out.println(pl.palindrome("madam"));
    }

    }



