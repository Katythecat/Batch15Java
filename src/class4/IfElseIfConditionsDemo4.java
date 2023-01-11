package class4;

public class IfElseIfConditionsDemo4 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 30;
        /*
        if number1 is equal number2 on console => numbers are equal
        if number1 > number2 => Number1 is greater than number2
        if number2 > number2 => Number2 is greater than number1

         */

        if(number1==number2){
            System.out.println("Number are equal");
        }else if(number1>number2){
            System.out.println("Number1 is greater than number2");
        }else{
            System.out.println("Number2 is greater than number1");
        }
    }
}
