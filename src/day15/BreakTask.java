package day15;

public class BreakTask {
    /*
    Create a method createEmail(). Based on values of users name,
    lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */

    String email( String userName, String lastName, String emailType){
        // (userName.toLowerCase()+lastName.toLowerCase()+"@"+emailType.toLowerCase()+".com");
        return userName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        BreakTask bt=new BreakTask();
        System.out.println(bt.email("Katy","Rami","gmail").toLowerCase());
    }
}
