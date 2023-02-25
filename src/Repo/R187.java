package Repo;
import java.util.ArrayList;
import java.util.Iterator;

public class R187 {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("hi");
        str.add("yo");
        str.add("sup");
        str.add("yolo");
        str.add("boop");

        str.remove(0); // remove "boop"
        str.remove(1); // remove "sup"
        str.remove(2); // remove "hi"

        // Print the remaining values in one line
        for (String value : str) {
            System.out.print(value + " ");
        }
        }
    }

