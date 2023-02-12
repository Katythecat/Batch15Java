package class23;

public class TaskTester {
    public static void main(String[] args) {
        Student [] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for(Student s:students){
            s.study();
            s.test();
        }


    }
}
