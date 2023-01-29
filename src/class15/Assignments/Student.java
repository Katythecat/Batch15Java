package class15.Assignments;

public class Student {
    char getGrade(int score){
        if(score>90){
            return 'A';
        }else if(score>80) {
            return 'B';
        }else if(score>70){
            return 'C';
        }else if(score>50){
            return 'D';
        }else{
            return 'F';
        }
    }

    public static void main(String[] args) {
        Student st=new Student();
        System.out.println(st.getGrade(95));
    }
}
