package class20_1;

import class19.Assignments.Teacher;

public class SeleniumTeacher extends Teacher {
    public static void main(String[] args) {
        SeleniumTeacher sl = new SeleniumTeacher();
        sl.homework();
        sl.grade();//protected members available through
        //the inheritance

    }
}