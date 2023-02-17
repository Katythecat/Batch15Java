package class26;

public interface TrustAble {
    public static final int age=10;// constants
    //by default all variable are static and final and public
    int trust();
    //after this for dev he just teaches to know

    static void method(){//if we don't put static here java will think we create abstract method
        System.out.println("Hello world");
    }

    default void method2(){

    }

    private void method3(){

    }
}

class Bank implements TrustAble{
    @Override
    public int trust() {
        return 0;
    }
}

