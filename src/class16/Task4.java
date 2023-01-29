package class16;

public class Task4 {
    String sayHello(String country){
        switch (country){
            case "Thailand" : return "Sawasdee";
            case "Japan" : return "Con-ni-chi-wa";
            case "Peru" : return "Hola";
            case "China" : return "Ni-hoa";
            case "France" : return "Bonjour";
            default: return "Country not supported";
            //break is not needed when we use return keyword
        }
    }

    public static void main(String[] args) {
        Task4 ts=new Task4();
        System.out.println(ts.sayHello("Thailand"));
    }
    }

