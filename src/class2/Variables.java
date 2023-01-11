package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computer memory.
        we are calling it box1 if we need information that we are storing inside this box
        we can simply say to the computer give us the contents of box1
        int=>what type of data we want to store
        box1=> us the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10=>is what we are storing inside the box
         */
       int box1 = 10;
        //if we are printing something from a box we don't need ""
        System.out.println(box1);//bring the contents of box1 and print them on the console
        byte box2 = 127;
        byte box3 = -128;
        short box4 = 32767;
        int biggerBox = 123456484;
        long maxBox = 4546784654847964645L;

       short myBox = 10000;
        System.out.println(myBox);

    }
}
