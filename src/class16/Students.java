package class16;

public class Students {


    String stuName;
    String stuId;
    static int numberOfStudents;

    Students(String stuName, String stuId){
        this.stuName=stuName;
        this.stuId=stuId;
        numberOfStudents++;

    }
    void show(){
        System.out.println("Student name "+stuName+" and ID "+stuId);
    }

    static void print(){
        System.out.println("Total of students "+numberOfStudents+" students");
    }


}
