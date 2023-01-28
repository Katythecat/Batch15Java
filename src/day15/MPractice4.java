package day15;

public class MPractice4 {
    int largest(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {

        MPractice4 mp = new MPractice4();
        System.out.println(mp.largest(5,9));
    }
}