package class33.Assignment;

public class Task3 {
    /*
    3) Create a method to check age eligibility that will throw a runtime exception.
        Method should throw an exception age is less than 16.
     */

    public static void eligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Age is less than 16");
        }
    }


    public static void main(String[] args) {
        int age=13;
        try{
            eligibility(age);
            System.out.println("Age is eligible");
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }
}


