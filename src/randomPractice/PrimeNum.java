package randomPractice;
public class PrimeNum {
    public static void main(String[] args) {
        int count=0;
        int num =4;

        for (int i = 1; i <=num; i++) {
            if(num%2==0){
                count++;
            }
        }
        if(count>1){
            System.out.println(num+" This number is not Prime");
        }else{
            System.out.println(num+" This number is Prime");
        }
        }
    }





