package class33;

/*class LazyException extends RuntimeException{
    LazyException(String msg){
        super(msg);
    }
}*/
public class ExceptionDemo4 {
    public static void main(String[] args) {

        String name="Abeera";
        if(name.length()<8){
            throw new LazyException("Lazy person found");
        }
        //very rare for tester no worries!!!!!!
    }
}
