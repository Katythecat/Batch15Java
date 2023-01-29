package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        //System.out.println(person.bankBalance);
        //we cannot access private out of class
        System.out.println(person.name);
        System.out.println(person.address);

        person.printTiktokAccount();
        person.printSSN();


    }
}
