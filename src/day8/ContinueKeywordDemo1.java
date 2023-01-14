package day8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i==3||i==6||i==9){
                continue;
            }else{
                System.out.println(i);
            }
        }
    }


}
