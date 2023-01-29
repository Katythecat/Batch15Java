package class16;


public class StudentTester {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="Zafar";
        stu.id="123";
        stu.age=22;
        stu.weight=70;
        //stu.schoolName="Syntax";

        Student stu1=new Student();
        stu1.name="Hamid";
        stu1.id="456";
        stu1.age=5;
        stu1.weight=86;
        //stu1.schoolName="Syntax";

        Student stu2=new Student();
        stu2.name="Nelson";
        stu2.id="789";
        stu2.age=26;
        stu2.weight=90;
        //stu2.schoolName="Syntax";

        System.out.println(stu2.schoolName);
        System.out.println(Student.schoolName);
//we can access by name of the class(instead of obj)
        System.out.println();
    }
}
