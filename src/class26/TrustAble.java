package class26;

public interface TrustAble {
    public static final int age=10;// constants
    //by default all variable are static and final and public

    abstract int trust(); //by default method in interface are abstract and don't have body
    //after this for dev he just teaches to know


    //from java 8 we have static, default, and private method and can have body inside

    static void method(){//if we don't put static here java will think we create abstract method
        System.out.println("Hello world");
    }

    default void method2(){
        System.out.println("This is default method in interface");

    }

    private void method3(){

    }
}

abstract class Card implements TrustAble{

    //if we don't want to implement the method from interface we can declare abstract at the class name
    // and at the method
    @Override
    public abstract int trust();
    }


class Bank implements TrustAble{

    //when we have static default and private method in interface
    //we don't need to implement in the subclass but when we create an obj when call it
    // all method can go to execute except private method


    @Override
    public int trust() {
        return 15;
    }


    public static void main(String[] args) {
        Bank bank=new Bank();
        System.out.println(bank.trust());
        bank.method2();
        TrustAble.method(); // call static from interface
    }

    }

