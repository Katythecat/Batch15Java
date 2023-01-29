package class16;

public class Person {
    private double bankBalance=1250000; //private keyword visible only the same class
    String address = "Street 123";//default access level is applied
    public String name="Jon Snow";

    private void printPhonePassword(){
        System.out.println("Pass123");

    }
    void printSSN(){
        System.out.println("123456789");
    }

    public void printTiktokAccount(){
        System.out.println("user123");

    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printSSN();
        person.printPhonePassword();
        person.printTiktokAccount();
    }

}
