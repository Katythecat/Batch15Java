package class19.Assignments;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher tc=new Teacher();
        tc.teacherName="Babara";
        tc.teacherId="T121";

        System.out.println("This is principal "+tc.teacherName);
        //tc.extraPoint();//this is private

        MathTeacher mt=new MathTeacher();
        mt.teacherName="Luna";
        mt.teacherId="M221";
        mt.subject="Math";
        System.out.println("Teacher "+mt.teacherName+" teach "+ mt.subject);
        mt.excellent();
        mt.homework();

        ChemistryTeacher ct=new ChemistryTeacher();
        ct.teacherName="Leonardo";
        ct.teacherId="C332";
        System.out.println("This class teach by "+ct.teacherName);
        ct.science();
        ct.homework();
        ct.scholarship();


        Pianoteacher pt=new Pianoteacher();
        pt.teacherName="Alice";
        pt.teacherId="P456";

        System.out.println("This class open for all grade teach by "+pt.teacherName);
        pt.happy();
        pt.grade();


    }
}
