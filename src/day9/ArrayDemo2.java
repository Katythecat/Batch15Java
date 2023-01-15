package day9;

public class ArrayDemo2 {
    public static void main(String[] args) {

        //10 20 30 45 50
        int[] num={10,20,30,45,50};
        int sum=0;
        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
