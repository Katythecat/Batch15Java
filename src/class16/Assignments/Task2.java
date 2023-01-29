package class16.Assignments;

public class Task2 {
/*
2) Create a method that will take a String as a parameter and returns reversed String.
 Method should be available to all classes within your project and accessible by class name.
 */

    public String reverse(String str) {
            return new StringBuilder(str).reverse().toString();
        }


    public static void main(String[] args) {

        Task2 ts=new Task2();
        System.out.println(ts.reverse("Seattle"));

    }
}
