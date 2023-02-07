package class16;

public class StudentsTester {
    public static void main(String[] args) {
        Students leo=new Students("Leo","010");
        //leo.stuName="Leo";
        //leo.stuId="010";
        //Students.numberOfStudents++;
        leo.show();

        Students nala=new Students("Nala","011");
        //nala.stuName="Nala";
        //nala.stuId="011";
        //Students.numberOfStudents++;
        nala.show();

        Students gato=new Students("Gato","012");
        //gato.stuName="Gato";
        //gato.stuId="012";
       // Students.numberOfStudents++;
        gato.show();
       // System.out.println("Total of students "+Students.numberOfStudents);
        Students.print();
    }
}
