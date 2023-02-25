package class29;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String>makeup=new ArrayList<>();
        makeup.add("Lipstick");
        makeup.add("Eyeline");
        makeup.add("Blushone");
        makeup.add("Foundation");
        makeup.add("Mascarae");

        makeup.removeIf(x -> x.endsWith("e"));
        System.out.println(makeup);
    }
}
