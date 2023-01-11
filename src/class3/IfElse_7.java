package class3;

public class IfElse_7 {
    public static void main(String[] args) {
        int money = 150;
        System.out.println(money>=300);
        if(money>=300){
            System.out.println("Yayy lets go for shopping");
        }
        else{
            System.out.println("We are Not go for shopping");
        }

        if(money<300){//java will print only the true statement after if
            System.out.println("Lets save more");
            System.out.println("May be I am spending too much on food");
        }

    }

}
