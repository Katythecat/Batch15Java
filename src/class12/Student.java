package class12;

public class Student {

    String name;
    int id;
    char grade;
    String subject;
    String city;
    void display(){
        System.out.println(name+" "+id+" "+grade);
    }

    void study(){
        System.out.println("Student study Monday - Friday");
    }
    void play(){
        System.out.println("Each student has one sport per semester");
    }
}
