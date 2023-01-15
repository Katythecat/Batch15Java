package day9.HW;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create an array of names and store all names of your group.
        Then print your name from that array.
         (use 2 different ways of creating an array).
         */

        String[] name={"Regina","Svetlana","Ridvan","Wilasinee","Patrick","Tetiana","Rami","Natalia"};
        System.out.println(name[3]);

        String[] names=new String[8];
        names[0]="Regina";
        names[1]="Svetlana";
        names[2]="Ridvan";
        names[3]="Wilasinee";
        names[4]="Patrick";
        names[5]="Tetiana";
        names[6]="Rami";
        names[7]="Natalia";
        System.out.println(names[3]);
    }
}
