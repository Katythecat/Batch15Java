package class15;

public class MethodPractice2 {

    String reverseStr(String input) {
        String newStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            newStr+=input.charAt(i);
        }
        return newStr;
    }

    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
    }

    String reverseStr2(String input){
        StringBuilder sb=new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }
}

