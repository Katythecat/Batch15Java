package class19.Assignments;

public class JavaTeacher extends Teacher {

    void code(){
        System.out.println("Java teacher teaches how to code");
    }

    public static void main(String[] args) {
        JavaTeacher java=new JavaTeacher();
        java.teacherName="Asel";
        java.teacherId="J1587";
        java.homework();//public
        java.scholarship();//default
        java.grade();//protected
        //java.extraPoint();//private members(variable and methods)
        //DO NOT participate in the Inheritance
    }
}
