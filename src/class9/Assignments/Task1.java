package class9.Assignments;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an array of chars and store grades into it: A,B,C,D,E,F.
         Then print a grade B (use 2 different ways of creating an array).
         */

        char[] grades={'A','B','C','D','E','F'};
        System.out.println(grades[1]);

        char[] grade=new char[6];
        grade[0]='A';
        grade[1]='B';
        grade[2]='C';
        grade[3]='D';
        grade[4]='E';
        grade[5]='F';
        System.out.println(grade[1]);

    }
}
