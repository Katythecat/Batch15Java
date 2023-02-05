package class19.Assignments;

public class Teacher {
    String teacherName;
    String teacherId;

    public void homework() {
        System.out.println("Homeworks make students perfect!!!!");
    }

    public void grade() {
        System.out.println("Grade doesn't matter");
    }

    public void scholarship() {
        System.out.println("Good students from this class will get scholarship");
    }

    public void ExtraPoint() {
        System.out.println("All students attend the class will get extra point");
    }
}
     class MathTeacher extends Teacher{
        String subject;
        String grade;

        void excellent(){
        System.out.println("This class is excellent");
    }
    }

    class ChemistryTeacher extends Teacher{
        String homework;
        String test;

        void science(){
            System.out.println("Chemistry class is fun");
        }
    }

    class Pianoteacher extends Teacher{
        String classic;
        String schedule;

        void happy(){
            System.out.println("This class make students happy");
        }
    }


