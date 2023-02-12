package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i==3||i==6||i==9){ // jump 3 6 9
                continue;
            }else{
                System.out.println(i);//0 1 2  4 5   7 8
            }
        }
    }


}
