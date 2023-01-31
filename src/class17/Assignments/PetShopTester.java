package class17.Assignments;

public class PetShopTester {
    public static void main(String[] args) {
        //PetShop pt=new PetShop("Dog",250);
        PetShop p1=new PetShop("White","Dog",150,"Male");
        PetShop p2=new PetShop(100,"Female","Orange");
        PetShop p3=new PetShop("Fish",10,"Orange");
        //pt.display(); cannot call private outside the class
        p1.display();//default
        p2.display();//protected
        p3.display();//public
        // outside the class but inside the same package can call default,protected,public
    }
}
