package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name = "Nima";
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        System.out.println(search(names,name));
    }
    public static boolean search(String[] names, String name) {
        for (String str : names) {
            if (name.equals(str)) {
                return true;
            }
        }
        return false;
    }

}



