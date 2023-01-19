package class11.Assignments;

public class Task3 {
    public static void main(String[] args) {
        /*
         Create a 2D array(shorter way) in which first array will consist of 4 names
          and second array will contain grades. Then your program should print name
          of the students that has A and B grade
         */

        String[][] students = {{"Nigel", "Jeanny", "John", "Nat"},
                {"A", "C", "B", "F"}};
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                if (students[i][j].equals("A") || students[i][j].equals("B")) {
                    System.out.println(students[0][j]);//at row zero and all j element in first row
                    // I want to print name of students so I will use zero row
                    //if I want to print grade I should refer to students[1][j]
                }
            }
            System.out.println("---------");


           /* String[] name = {"Nigel", "Jeanny", "John", "Nat"};
            String[] grade = {"A", "C", "B", "F"};
            String[][] student = {name, grade};

            //In this case I want to print grade of Jeanny and Nat
            //I specify Jeanny and Nat by using zero row of loop a
            //and when I print I call grade by specify row 1 of loop a
            for (int a = 0; a < student[0].length; a++) {
                if (student[0][a].equals("Jeanny") || student[0][a].equals("Nat")) {
                    System.out.println(student[1][a]);
                }
            }*/
        }

    }
}







