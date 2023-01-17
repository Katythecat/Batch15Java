package class6;



public class LogicalNotDemo {
    public static void main(String[] args) {
        System.out.println(false);
        System.out.println(!false);//true
        boolean codition=!true;
        System.out.println(codition);//false

        String password="fslekutiosd";
        System.out.println(password.equals("Pass123"));
        if(!password.equals("Pass123")){
            System.out.println("Wrong password");
        }

        boolean isRaining=true;
        if(!isRaining){
            System.out.println("Lets go for a walk");
        }else{
            System.out.println("Let take the umbrella");//execute here
        }

    }

}
