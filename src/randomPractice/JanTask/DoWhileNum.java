package randomPractice.JanTask;

public class DoWhileNum {
    public static void main(String[] args) {
        /*
       Print numbers from 1 to 50 except those that are divisible by 3
         */
        int i=1;
        do{
            if(i%3!=0){
                System.out.print(i+" ");
            }
            i++;
        }while(i<=50);

        System.out.println();
        for (int j = 1; j <=50 ; j++) {
            if(j%3!=0){
                System.out.print(j+" ");
            }
        }
    }
}
