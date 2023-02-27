package class30;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    /*
    Create a Set collection that will hold Objects of Student Type.
         In this set we do not care about the insertion order.
         Each student object should have name and studentID.
          Display name of each student.
     */
    public static void main(String[] args) {
        //HashSet<Student> students=new HashSet<>();
        Set<Student> students=new HashSet<>();
        students.add(new Student("Savo",123));
        students.add(new Student("Nima",456));
        students.add(new Student("Tami",258));
        students.add(new Student("Sam",357));

        for(Student student:students){
            System.out.println(student.getName());
        }
    }
}

class Student {
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }
}
