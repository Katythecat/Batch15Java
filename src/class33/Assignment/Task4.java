package class33.Assignment;



public class Task4 {
    public static void userName(String user){
        if(user.length()<5){
            throw new RuntimeException("Username should grater than 5 charactor");
        }

    }

    public static void main(String[] args) {
        String user="Leo4";
        try {
            userName(user);
            System.out.println("You have created a username");
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
