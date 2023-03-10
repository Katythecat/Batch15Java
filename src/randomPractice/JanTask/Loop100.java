package randomPractice.JanTask;

public class Loop100 {
    public static void main(String[] args) {
        //write a loop to print numbers from 1 to 100
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }

        System.out.println();
        //write a loop to print odd numbers from 1 to 15
        for (int i = 1; i <=15 ; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //write a loop to print these number 5,10,15,20,25,30.... 50
        for (int i = 5; i <=50 ; i+=5) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Print numbers from 1 to 100 in 1 line with space
        for (int i = 1; i <=100 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Print numbers from 100 to 1
        for (int i = 100; i >= 1; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Print even numbers from 20 to 1 (2 ways)
        for (int i = 20; i >=1 ; i--) {
            if(i%2==0)
            System.out.print(i+" ");
        }
        System.out.println();
        int i=20;
        while( i>=1){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i--;
        }
        System.out.println();
        int a=20;
        while(a>=1){
            System.out.print(a+" ");
            a-=2;
        }
        System.out.println();
        //Print odd numbers between 20 and 50 (2 ways)
        for (int j = 20; j <=50 ; j++) {
            if(j%2!=0){
                System.out.print(j+" ");
            }
        }
        System.out.println();
        int b=21;
        while(b<=50){
            System.out.print(b+" ");
            b+=2;
        }

    }
}
