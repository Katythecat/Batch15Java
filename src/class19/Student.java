package class19;

public class Student {
    String name;
    String address;

    Student(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println("Student name is "+name+" and the address "+ address);
    }

}
