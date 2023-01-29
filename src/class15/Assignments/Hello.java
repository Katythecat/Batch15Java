package class15.Assignments;
public class Hello {

    String sayHi(String country){
        switch (country) {
            case "Thailand":
                return "Sawasdee";
            case "Peru":
                return "Hola";
            case "China":
                return "Nihoa";
            case "USA":
                return "Hello";
            case "France":
                return "Bonjour";
            default:
                return "Invalid country";
        }

    }

    public static void main(String[] args) {
        Hello hl=new Hello();
        System.out.println(hl.sayHi("Thailand"));


    }
}
