package class20_1;
import class19.Assignments.JavaTeacher;


public class University{
    public static void main(String[] args) {
        JavaTeacher jt=new JavaTeacher();
        jt.homework();//public
        //jt.grade(); //protected not visible in
        //different package
        //jt.scholarship();//default not visible
        //jt.extraPoint();//private
    }
}
