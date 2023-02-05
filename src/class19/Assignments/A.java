package class19.Assignments;

public class A {
    String name;
    String address;

    void print(){
        System.out.println("Employee information");
    }
}

class B extends A {
    String city;
    String phoneNumber;

    void display(){
        System.out.println("Employee city and phone number");
    }

}

class C extends B {
     String gender;


     void show(){
         System.out.println("Employee gender");
     }

    public static void main(String[] args) {
         A aa=new A();
         aa.name="Jane";
         aa.address="123 Cat Street";

         aa.print();

         B bb=new B();
         bb.name="Mike";
         bb.address="456 Dog Street";
         bb.city="Miami";
         bb.phoneNumber="123-1587-123";

         bb.print();
         bb.display();

         C cc=new C();
         cc.name="Toddy";
         cc.address="159 Rabbit Street";
         cc.city="NY";
         cc.phoneNumber="1477-1258-321";
         cc.gender="Male";

         cc.print();
         cc.display();
         cc.show();

         //C can access everything from B and A
    }
}

