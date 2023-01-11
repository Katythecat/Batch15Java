package class4;

public class NestIfDemo7 {
    public static void main(String[] args) {

        boolean studyHard = true;
        int salary = 120000;

        if(studyHard){

            System.out.println("We get the jobs");

            if(salary>100000){
                System.out.println("Let's buy Tesla");
            }else{
                System.out.println("Let's buy Toyota");
            }


        }else{
            System.out.println("It might take a little for us to get the jobs");
        }



    }
}
