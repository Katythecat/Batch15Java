package RandomPractice;

public class MosCode {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            if (i == 1 || i == 3) {
                System.out.println();
            }else{
                if(i%2==0){
                    System.out.println("*");
                }else{
                    System.out.println("**");
                }
            }
        }
    }
}
