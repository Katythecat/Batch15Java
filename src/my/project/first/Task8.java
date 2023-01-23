package my.project.first;

public class Task8 {
    public static void main(String[] args) {
        /*
        8)Write a Java Program to print the first 10 numbers of Fibonacci series.
        0 1 1 2 3 5 8 13 21 34
         */

        int n1=0 , n2=1 , n3;
        System.out.print(n1+" "+n2);// 0 1
        for (int i = 1; i <=8 ; i++) {//I have 2 numbers already I need to find 8 more numbers
            n3=n1+n2; // 1=1+0, 2=1+1, 3=1+2 , 5=2+3, 8=3+5, 13=5+8, 21=8+13, 34=13+21
            System.out.print(" "+n3);//1 2 3 5 8 13 21 34
            n1=n2; // assign n2 into n1 // new n1 = 1, 1, 2, 3, 5, 8, 13
            n2=n3; //assign n3 into n2 // new n2 = 1, 2, 3, 5, 8, 13, 21

        }
    }
}
