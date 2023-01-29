package class15.Assignments;

public class LargestNumber {

    int largest(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void main(String[] args) {
        LargestNumber lt=new LargestNumber();
        System.out.println("The largest number is "+lt.largest(8,15));
    }
}
