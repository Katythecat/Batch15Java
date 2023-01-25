package class13;

public class Task1 {
    public static void main(String[] args) {

        String str="byee rr";
        if(!str.isEmpty()){
            if(str.length()%2!=0&&str.length()>3){
                int middle=str.length()/2;
                System.out.println(str.charAt(middle));
            }
        }
    }
}
