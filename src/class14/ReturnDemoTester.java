package class14;

import java.util.Scanner;

public class ReturnDemoTester {
    public static void main(String[] args) {
        ReturnDemo rd=new ReturnDemo();

        String str=rd.method1();
        System.out.println(str);

        int result= rd.method2();
        System.out.println(result);

    }
}
