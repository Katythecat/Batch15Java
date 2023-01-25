package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like java. I write a lot of code daily. I am from batch 15";
        String[] strarr=str.split("[.?!]");
        System.out.println(strarr.length);//3
        //whenever we are working with arrays we use the length
        //and whenever we are working with string wr use the length()
        System.out.println(strarr[0]);//I like java
        System.out.println(strarr[1].trim());//I write a lot of code daily
        System.out.println(strarr[2].trim());//I am from batch 15


    }
}
