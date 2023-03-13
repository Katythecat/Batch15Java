package class33;

import class11.Ex;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        System.out.println("Line5");
        System.out.println("Line6");
        try{
            //here we put the code which might throw an error
            String name=null;
            System.out.println(name.length());
        }catch(Exception e){
            System.out.println("Enter text instead of null");

            System.out.println(e.getMessage());//null
        }
        System.out.println("Line7");
        System.out.println("Line8");
        System.out.println("Line9");

    }
}
