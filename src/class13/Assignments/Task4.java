package class13.Assignments;

public class Task4 {
    public static void main(String[] args) {
        /*
        4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */



        String str="I am hungry I want to eat but I have to do my homework";
        String[] str1=str.split(" ");

        String reverse="";
        for (String x:str1) {
            StringBuilder sb=new StringBuilder(x);
            sb.reverse();
            reverse=reverse+sb.toString()+" ";
        }
        System.out.println(reverse);
    }
}
