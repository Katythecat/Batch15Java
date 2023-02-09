package class21;

public class OverloadPrivate {

    private void print(int a, int b) {
        System.out.println(a + b);
    }

    private void print(double a, int b){
        System.out.println(a+b);
    }

    private void print(int a, double b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        OverloadPrivate ov=new OverloadPrivate();

        ov.print(10,20);
        ov.print(15.55,20);
        ov.print(10,20.5,20);


    }
}



