package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number = 125;
        byte shorterNumber = (byte) number;
        System.out.println(shorterNumber);
        float f = 10.5f;
        int num = (int) f;
        System.out.println(num);//10
        /*
        byte
        short
        int
        long
        float
        double
        smaller to larger
        if we try to store the contents from the smaller box to the larger box
        java doesn't complain because the content can easily fit inside the larger box
        but if we try the other way around we get an error and we need to type case
        it to store the contents
         */
        byte b = 10;
        int number2 = b;
        short c =(short) number2;
        System.out.println(b);

        float eggs = 12.5f;
        int wholePart = (int) eggs;//type casting we are converting from float to an int
        System.out.println(wholePart);


    }
}
