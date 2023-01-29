package class16;

public class StudentsTester {
    public static void main(String[] args) {
        Students leo=new Students();
        leo.stuName="Leo";
        leo.stuId="010";
        leo.numberOfStudents++;

        Students nala=new Students();
        nala.stuName="Nala";
        nala.stuId="011";
        nala.numberOfStudents++;

        Students gato=new Students();
        gato.stuName="Gato";
        gato.stuId="012";
        gato.numberOfStudents++;
        System.out.println(Students.numberOfStudents);

    }
}
