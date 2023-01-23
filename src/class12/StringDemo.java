package class12;

public class StringDemo {
    public static void main(String[] args) {
        //Creating an object of the String class
        String str=new String("Java");
        //another wat to create an object of string class a shorter way
        //mostly this is how we create the objects of string class
        String str1="java";
        System.out.println(str1.length());//4
        String str2="Banana ";
        int len=str.length();
        System.out.println(len);//7
        String name="Hamid poya ";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 characters");
        }
    }
}
