package class23;

public class Task {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
}

class Student{

    public void study(){
        System.out.println("Student like to study");
    }
    public void test(){
        System.out.println("All students has to pass a test");
    }
}

class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Syntax Student love java");
    }

    @Override
    public void test() {
        System.out.println("Syntax Student have to test code everyday");
    }

    public void play(){
        System.out.println("Syntax Student play a lot in a class");
    }
}

class CollegeStudent extends Student{
    @Override
    public void study() {
        System.out.println("College Student love to hangout more than study");
    }


}

class SchoolStudent extends Student{

}