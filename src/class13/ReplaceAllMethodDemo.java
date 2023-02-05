package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="hkJEH^Wv157oihrgro1324635%@^%^!%";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));// ^ mean not

        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));// empty will remove

    }

}
