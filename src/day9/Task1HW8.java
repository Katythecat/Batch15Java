package day9;

public class Task1HW8 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%3!=0){
                System.out.print(i+" ");
            }
        }

        System.out.println("****");
        for(int i=1;i<=50;i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
