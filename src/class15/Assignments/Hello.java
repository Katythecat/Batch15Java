package class15.Assignments;
public class Hello {

    String sayhi(String country){
        String Thailand, Peru, China, USA, France;
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
        System.out.println(hl.sayhi("Thailand"));


    }
}
